package com.biz.book.controller;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.biz.book.domain.BookVO;
import com.biz.book.service.BookService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/api")
public class BookApiController {
	
	
	private final BookService bService;
	public BookApiController(BookService bService) {
		this.bService=bService;
	
	}
	
	@RequestMapping(value = "/insert" , method=RequestMethod.POST)
	public String insert(@RequestBody BookVO bookVO) {
		
		log.debug("BOOKVO"+ bookVO.toString());
		
		bService.insert(bookVO);
		return "OK";
		
	}
	
	@RequestMapping(value = "/list", method=RequestMethod.GET)
	public Page<BookVO> select(Pageable pageable){
		
		Page<BookVO> pages = bService.pageSelect(pageable);
		
		return pages;
		
	}

}
