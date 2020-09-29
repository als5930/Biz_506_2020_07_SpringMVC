package com.biz.iolist;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.book.mapper.IolistDao;
import com.biz.model.IolistVO;


@Controller
@RequestMapping(value = "/iolist")
public class IolistController {
	
	private IolistDao iolistDao;
	
	
	@RequestMapping(value = "/iolist", method=RequestMethod.GET)
	public String list(Model model) {
		
		List<IolistVO> iolistList = iolistDao.selectAll(); 
		
		model.addAttribute("IOLIST",iolistList);
		model.addAttribute("BODY","Iolist-list");
		return "home";
		
	}

	


}
