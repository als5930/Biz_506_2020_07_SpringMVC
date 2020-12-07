package com.biz.bbs.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.bbs.model.NoticeVO;
import com.biz.bbs.service.NoticeService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/api")
public class NoticeApiController {

	private final NoticeService notService;
	
	public NoticeApiController(NoticeService notService) {
		this.notService = notService;
	
	}
	
	@RequestMapping(value = "/apilist", method = RequestMethod.GET)
	public List<NoticeVO> noList(){
		
		List<NoticeVO> noList = notService.selectAll(); 
		return noList;
	}
	
	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
	public NoticeVO noId(@PathVariable("id") String id) {
		long long_id = Long.valueOf(id); 
		NoticeVO noVO = notService.findBySeq(long_id);		
		return noVO;
	}
	

	
}
