package com.biz.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.book.mapper.ReadBookDao;
import com.biz.book.model.ReadBookVO;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
@Controller
@RequestMapping(value = "/read")
public class ReadBookController {

	
	private final ReadBookDao rbookDao;
	
	@RequestMapping(value = "/write", method=RequestMethod.POST)
	public String write(@ModelAttribute ReadBookVO rbookVO) {
		
		log.debug("독서록 정보 :" + rbookVO.toString());
		int ret = rbookDao.insert(rbookVO);
		
		return "redirect:/books/detail/"+rbookVO.getR_book_seq();
	}
}
