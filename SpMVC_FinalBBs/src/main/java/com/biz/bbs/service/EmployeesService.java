package com.biz.bbs.service;

import java.util.List;

import com.biz.bbs.model.EmployeesVO;

public interface EmployeesService {

	List<EmployeesVO> selectAll();
	public int insert(EmployeesVO employeesvo);
	public EmployeesVO findById(Long id);
	public int update(EmployeesVO employeesvo);
	public int delete(Long id);


	
	
	
}
