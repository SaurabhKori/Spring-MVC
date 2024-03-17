package com.jsp.springmvc_springorm.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.jsp.springmvc_springorm.dto.Address;
import com.jsp.springmvc_springorm.dto.Course;
import com.jsp.springmvc_springorm.dto.User;
import com.jsp.springmvc_springorm.dto.User2;
import com.jsp.springmvc_springorm.service.UserService;


@Controller
public class RegController {
	@Autowired
	private UserService userService;
	@RequestMapping("/")
   public String reg() {
		System.out.println("Start");
	   return "regstration";
   }
//	@RequestMapping(path ="/processform",method = RequestMethod.POST )
//	public String insert(@ModelAttribute User user) {
//		System.out.println(user);
//		RedirectView r=new RedirectView();
//		userService.insert(user);
//		r.setUrl("succes");
//		return "suc";
//	}
	@RequestMapping(path ="/processform",method = RequestMethod.POST )
	public String insert(
			@RequestParam("userName") String name,
			@RequestParam("userEmail") String email,
			@RequestParam("userPhone") long phone,
			@RequestParam("userPass")String pass,
			@RequestParam("courses") String[] course,
			@RequestParam("dob") String date,
			@RequestParam("gender")String gender,
			@RequestParam("address.city") String city,
			@RequestParam("address.vill") String state,
			@RequestParam("address.pin") long pin,
			@RequestParam("address.vill") String vill
			
			
			) {
		System.out.println(pin);
		LocalDate d=LocalDate.parse(date);
		Address add=new Address(pin, vill, city, state);
		System.out.println("Start");
		
		System.out.println(name);
		System.out.println(gender);
		System.out.println(email);
		System.out.println(pass);
		List<Course> c=new ArrayList<Course>();
		
//		System.out.println("");
		for(int i=0;i<course.length;i++) {
			;
			;
			c.add(new Course(course[i]));
			
			}
		System.out.println(c);
		
		
		System.out.println(date);
		User user=new User(name, email, phone, c, gender, d, add, pass);
		userService.insert(user);
		return "suc";
		
		}
//		User user=new User(name, email, phone, pass);
//		
//		RedirectView r=new RedirectView();
//		if(user!=null) {
//			userService.insert(user);
//			r.setUrl("succes");
//			return r;
////			return "redirect:/succes";
//		}
//	return null;
//	
//		
//	
//	}
	@RequestMapping("/succes")
	public String suc() {
		return "suc";
	}
}
