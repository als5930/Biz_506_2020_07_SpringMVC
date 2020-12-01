package com.biz.bbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.bbs.model.EmployeesVO;
import com.biz.bbs.service.EmployeesService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/api")
public class EmployeesController {


	private final EmployeesService EmService;
	public EmployeesController(EmployeesService EmService) {
		this.EmService=EmService;
	
	}
	
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert(@RequestBody EmployeesVO EmVO) {

		EmService.insert(EmVO);
		
		return "OK";

	}

}
