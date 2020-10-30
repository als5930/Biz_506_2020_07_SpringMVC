package com.biz.grade.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.biz.grade.model.GradeVO;
import com.biz.grade.service.GradeService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	
	@Autowired
	@Qualifier("gradeServiceV1")
	private GradeService gradeService;


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		 List<GradeVO> graList = gradeService.seleAll();
	      model.addAttribute("GRA_LIST",graList);
		return "home";
	}
	
	@RequestMapping(value = "/write", method=RequestMethod.GET)
	   public String write(Model model,GradeVO gradeVO) {
	      
		
	      model.addAttribute("GRADE",gradeVO);
	      return "write";
	   }
	 @RequestMapping(value = "/write", method=RequestMethod.POST)
	   public String write(GradeVO gradeVO,Model model ) {
			
		 int ret = gradeService.insert(gradeVO);
	      if(ret > 0) {
	         log.debug("INSERT 수행한 후 결과 {}개 성공", ret);
	      }
	      return "redirect:/";
	   }
	 
		@RequestMapping(value = "/update", method=RequestMethod.GET)
		   public String update(Model model,String seq,GradeVO gradeVO) {
			 int ret = gradeService.update(gradeVO);
		      if(ret > 0) {
		         
		      }
		      return "write";
		   }
	
	 @RequestMapping(value = "/update", method=RequestMethod.POST)
	   public String update(GradeVO gradeVO,Model model) {
		
	
	
	      int ret = gradeService.update(gradeVO);
	      if(ret > 0) {
	         log.debug("업데이트된 데이터 개수 {}", ret);
	      }
	      
		 
		return "redirect:/";
	   }
	 
	 
	
	 
	 

	 @RequestMapping(value = "/delete", method=RequestMethod.GET)
	   public String delete(String seq  ) {
			
		 Long long_seq = Long.valueOf(seq);
	      
	      GradeVO gradeVO = gradeService.findById(long_seq);
	      int ret = gradeService.delete(long_seq);
	      if(ret > 0) {
	         log.debug("삭제된 데이터 개수 {}",ret);
	      }
	   
	      return "redirect:/";
	   }
	 
	 
}
