package com.biz.iolist.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.biz.iolist.model.IolistVO;
import com.biz.iolist.service.IolistService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/")
public class IolistController {

	@Autowired
	@Qualifier("ioserviceV1")
	private IolistService ioService;

	@Transactional

	@RequestMapping(value = { "/", "" }, method = RequestMethod.GET)
	public String home(Model model) {

		return "home";

	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {

		List<IolistVO> ioList = ioService.selectAll();

		model.addAttribute("IOLIST", ioList);

		model.addAttribute("BODY", "IOLIST-LIST");
		return "home";
	}

	@RequestMapping(value = "/input", method = RequestMethod.GET)
	public String input(Model model) {

		model.addAttribute("BODY", "IOLIST-WRITE");

		return "home";

	}

	@RequestMapping(value = "/input", method = RequestMethod.POST)
	public String input(@ModelAttribute("IolistVO") IolistVO iolistVO) {

		LocalDateTime localDateTime = LocalDateTime.now();
		String Date = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(localDateTime);
		String Time = DateTimeFormatter.ofPattern("HH:mm:ss").format(localDateTime);

		iolistVO.setIo_date(Date);
		iolistVO.setIo_time(Time);

		ioService.insert(iolistVO);

		return "redirect:/list";

	}

	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detail(@RequestParam("id") Long seq, Model model) {

		IolistVO ioVO = ioService.findById(seq);
		log.debug(ioVO.toString());
		model.addAttribute("IolistVO", ioVO);
		model.addAttribute("BODY", "IOLIST-DETAIL");

		return "home";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)

	public String delete(@RequestParam("seq") Long seq) {

		ioService.delete(seq);
		return "redirect:/list";
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(@RequestParam("id") Long seq, Model model) {

		IolistVO ioVO = ioService.findById(seq);
		model.addAttribute("IolistVO", ioVO);

		model.addAttribute("BODY", "IOLIST-WRITE");
		return "home";

	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(@ModelAttribute IolistVO ioVO, Model model) {

		int ret = ioService.update(ioVO);

		model.addAttribute("seq", ioVO.getSeq());
		return "redirect:/list";
	}
}
