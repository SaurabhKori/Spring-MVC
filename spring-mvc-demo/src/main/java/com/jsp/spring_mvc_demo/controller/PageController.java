package com.jsp.spring_mvc_demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	//Modle is InterFace which are send the data of jsp with the help of addAttribute() method;
	@RequestMapping("/")
	
  public String home(Model modle) {
		modle.addAttribute("name", "Saurabh");
		List<String> fruit=new ArrayList();
		fruit.add("Mango");
		fruit.add("Banana");
		fruit.add("Grapes");
		modle.addAttribute("fruit", fruit);
	  return "index";
  }
	@RequestMapping("/demo")
	public ModelAndView hello() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("b", "hello dear ! Are you Happy");
		mav.setViewName("demo");
		return mav;
	}
	@RequestMapping("/jstl")
	 public String jstl(Model modle) {
			modle.addAttribute("name", "Saurabh");
			List<String> fruit=new ArrayList();
			fruit.add("Mango");
			fruit.add("Banana");
			fruit.add("Grapes");
			modle.addAttribute("fruit", fruit);
		  return "jstl";
	  }
	
}
