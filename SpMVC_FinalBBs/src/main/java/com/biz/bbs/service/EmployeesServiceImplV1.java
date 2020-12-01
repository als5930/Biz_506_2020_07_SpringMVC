package com.biz.bbs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.bbs.mapper.EmployeesDao;
import com.biz.bbs.model.EmployeesVO;

@Service
public class EmployeesServiceImplV1 implements EmployeesService {

	@Autowired
	private EmployeesDao EmDao;

	@Override
	public List<EmployeesVO> selectAll() {

		List<EmployeesVO> emList = EmDao.selectAll();

		return emList;
	}

	@Override
	public int insert(EmployeesVO employeesvo) {

		EmDao.insert(employeesvo);

		return 0;

	}

	@Override
	public EmployeesVO findById(Long id) {
		EmployeesVO EmVO = EmDao.findById(id);

		return EmVO;
	}

	@Override
	public int update(EmployeesVO employeesvo) {

		return 0;
	}

	@Override
	public int delete(Long id) {

		return 0;
	}

}
