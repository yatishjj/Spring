package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HelloController {
	
	@RequestMapping("/hello")
   public ModelAndView helloworld(){
		
		ModelAndView model = new ModelAndView("hello");
		model.addObject("msg" , "Hello World");
		
		return model;
      
  
   }
}
