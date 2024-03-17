package com.jsp.spring_mvc_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;


@Controller
public class UploadfileControler {
	@RequestMapping("/uplod")
   public String upload() {
	   return "uploadfile";
   }
	@RequestMapping(path="/processfile", method = RequestMethod.POST)
	public String processUpload(@RequestParam("fileUpload") CommonsMultipartFile file) {
		System.out.println(file.getName());
		System.out.println(file.getContentType());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		System.out.println(file.getStorageDescription());
		System.out.println(file.getBytes());

		
		
		return "suc";
	}
}
