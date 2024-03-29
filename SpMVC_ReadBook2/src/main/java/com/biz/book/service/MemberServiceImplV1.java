package com.biz.book.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.biz.book.mapper.AuthorityDao;
import com.biz.book.mapper.UserDao;
import com.biz.book.model.UserDetailsVO;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("memberServiceV1")

/*
 * MemberServiceImplV1클래스의 필드변수가 있는 생성자를 자동으로 만들고 
 * private final 로 선언된 객체에 Container로 부터 객체를 주입받아 사용할수 있도록 만들어주는 lombok의 Annotation
 * MemberServiceImplV1(PasswordEndeer passwordEncoder){
 * this.passwordEncoder = passwordEncoder;
 * }
 */
@RequiredArgsConstructor
public class MemberServiceImplV1 implements MemberService{
	
	@Qualifier("passwordEncoder")
	private final PasswordEncoder passwordEncoder;
	
	// 회원정보 CRUD 구현
	private final UserDao userDao;
	
	// 회원의 권한(ROLE)정보 CRUD 구현
	private final AuthorityDao authDao;
	
	
	/*
	 * 컨트로러에서 회원정보를 전달받아서 비밀번호를 암호화 하고 userDao 보내서 저장하기
	 * 
	 * 사용자의 ROLE정보를 생성하여 AuthorityVO에 담고 저장하기
	 */
	public int insert(UserDetailsVO userVO) {

		String password = userVO.getPassword();
		String encPassword = passwordEncoder.encode(password);
		log.debug("password{), encPassword{}",password,encPassword);
		
		/*
		 * 회원테이블에 값이 없을때(0) 회원가입이 이루어지면
		 * 그 회원은 admin 권한을 갖고
		 * enabled 칼럼을 1세팅하여 즉시 로그인 이 가능하도록
		 * 자바에서 true로 값을 설정하면 오라클에서는 1로 저장
		 * 
		 * 두번째 가입되는 회원은
		 * enabled 칼럼을 0으로 세팅하여 즉시 로그인 안되도록 설정
		 * 자바에서 false로 값을 설정하면 오라클에서 0으로 저장된다
		 * 
		 * mysql은 true와
		 */
		int nCount=userDao.userConut();
		if(nCount>0) {
			userVO.setEnabled(false);
		}else {
			userVO.setEnabled(true);
		}
		
		// 평문으로 입력된 비밀번호를 암화된 비밀번호를 대치
		userVO.setPassword(encPassword);
		userDao.insert(userVO);
		
		return 0;
	}

	
	@Override
	public String userNameAndPassword(String username, String password) {
		UserDetailsVO userVO = userDao.findById(username);
		/*
		 * passwordEncdoder를 사용하여 암호화한
		 */
		
		// 결과값에 따라 3항연산자를 사용하여 ok 또는 fail 문자열을 
		return passwordEncoder.matches(password,userVO.getPassword()) ? "OK" : "FAIL";


	}

	@Override
	public UserDetailsVO findById(String username) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int update(UserDetailsVO userVO) {
		return	userDao.update(userVO);
		
		
	}



	
	
}
