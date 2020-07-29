package com.biz.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.biz.hello.model.StudentVO;
import com.biz.hello.service.studentService;

/*

 * 	Comment: 코드가 실행되는데 아무런 영향을 미치치 않는 설명문

 * @ : Annotation, 같은 주석이지만 괄호안의(Comment)과는 조금 다른 의미의 주석
 * 		-- 의미가 부여된 특별한주석
 * 		-- Java 1.5 부터 사용할수 있는 주석
 * 		-- 실제로, interface, class, method 등으로 구성된 모듈을
 * 		-- 한두개의 키워드로 현재의 소스코드에 부착시키는(include) 키워드
 * 		-- 메타데이터
 * 		-- 사용가능한 키워드가 정해져 있고, 이 키워드를 사용하기 위해서는
 * 			어딘가에 이 키워드로 실행가능(호출가능)한 클래스, 메서드가 존재해야 한다.
 */


@Controller
public class HelloController {

	@Autowired
	studentService stService;
	
	@ RequestMapping(value="/student")
	public String student(Model model) {
		
		StudentVO stVO = stService.findByStNum("30001");
		model.addAttribute("STUDENT",stVO);
	
		
		return "student";
		
		
		
	}
	

}