package com.biz.book.mapper;

import org.apache.ibatis.annotations.Select;

import com.biz.book.model.UserDetailsVO;

public interface UserDao extends GenericDao<UserDetailsVO, String>{
	
	@Select("SELECT COUNT(*) FROM tbl_member")
	public int userConut();

}
