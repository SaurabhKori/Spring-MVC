package com.jsp.spring_mvc_demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsp.spring_mvc_demo.dto.User;
@Controller
public class RegistrationControler {
	// if you want same data send from backend to more than two fronted then we can use @ModelAttribute
	@ModelAttribute
	public void message(Model mod) {
		
	 mod.addAttribute("header", "Welcome Dear");
	 
	}
	@RequestMapping("/reg")
	public String reg() {
		return "resistration";
	}
	//bind the data fronted to backend by @modelAttribute and fetch the data backend to fronted with the help Annotation
	@RequestMapping(path = "/processform",method = RequestMethod.POST)
	public String detail(@ModelAttribute User user) {
		
		return "resitrationdetail";
	}
	// fetch the data from fronted by @RequestParam
//	public String detail(
//			@RequestParam("userName") String name,
//			@RequestParam("email") String email,
//			@RequestParam("password")String pass,Model module
//			) {
//	   User user=new User(name, email, pass);
//	   System.out.println(user);
//	   
//	  
//	   module.addAttribute("userdetail", user);
//		return "resitrationdetail";
//	}

}
