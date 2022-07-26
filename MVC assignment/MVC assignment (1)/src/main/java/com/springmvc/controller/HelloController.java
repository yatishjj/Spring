package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HelloController {
	
	@RequestMapping("/hello")
   public ModelAndView helloworld(HttpServletRequest req,HttpServletResponse res){
		if(req.getParameter("btnsubmit")!=null)
		{
			int a=Integer.parseInt(req.getParameter("txt1"));
			int b=Integer.parseInt(req.getParameter("txt2"));
			int c=Integer.parseInt(req.getParameter("txt3"));
			int d=(a*b*c)/100;
			
			
			return new ModelAndView("hello","msg",d);
			
		}
		else
		{
			return new ModelAndView("hello");
		}
      
  
   }
}
