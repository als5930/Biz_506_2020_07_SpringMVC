package com.biz.blog;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.blog.service.BlogFileService;


@Controller
public class HomeController {
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
	
		return "home";
		
	}
	
	@RequestMapping(value = "/input",method = RequestMethod.GET)
	public String input() {
		return "write";
	}
	
	
	@RequestMapping(value = "/writer", method= RequestMethod.POST)
	public String writer(String title, String content, Model model) {
		System.out.println("제목"+title);
		System.out.println("내용"+ content);
		System.out.println("나는 POST Type writer method");
		
		model.addAttribute("TITLE",title);
		model.addAttribute("CONTENT",content);
		
		
		
		return "view";
	}
	
}
