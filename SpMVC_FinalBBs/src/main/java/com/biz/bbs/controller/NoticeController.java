package com.biz.bbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.biz.bbs.model.NoticeVO;
import com.biz.bbs.service.NoticeService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/notice")
public class NoticeController {
	
	
	@Autowired
	@Qualifier("noticeV1")
	private NoticeService noService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {

		List<NoticeVO> notList = noService.selectAll();
		model.addAttribute("noList", notList);
		return "notice/list";
	}
	
	@RequestMapping(value = "/writer", method = RequestMethod.GET)
	public String write(Model model) {
	
		model.addAttribute("NoticeVO");
		return "notice/writer";
	}

	@RequestMapping(value = "/writer", method = RequestMethod.POST)
	public String write(@ModelAttribute("NoticeVO") NoticeVO notVO) {

		noService.insert(notVO);
		return "redirect:/notice/list";

	}


	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detail(@RequestParam("id") String id, Model model) {

		long long_id = Long.valueOf(id);
		NoticeVO noVO = noService.findBySeq(long_id);
		log.debug(noVO.toString());
		model.addAttribute("NoticeVO", noVO);

		return "notice/detail";
	}


	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(@RequestParam("id") Long id) {

		noService.delete(id);
		return "redirect:/list";
	}
	

}
