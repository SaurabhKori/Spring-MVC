package com.jsp.spring_mvc_crud.maincontroler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.server.reactive.ContextPathCompositeHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.ContextExposingHttpServletRequest;
import org.springframework.web.context.support.ServletContextAttributeExporter;
import org.springframework.web.multipart.support.AbstractMultipartHttpServletRequest;
import org.springframework.web.multipart.support.RequestPartServletServerHttpRequest;
import org.springframework.web.servlet.function.ServerResponse.Context;
import org.springframework.web.servlet.view.RedirectView;

import com.jsp.spring_mvc_crud.dto.Product;
import com.jsp.spring_mvc_crud.service.ProductService;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {
	@Autowired
	private ProductService productService;
	@RequestMapping("/")
	public String home(Model mod) {
	List<Product> products=	productService.fetchAllData();
	for (Product product : products) {
		System.out.println(product);
	}
	mod.addAttribute("product", products);
		return "index";
	}
	@RequestMapping(path="/handletohome" ,method = RequestMethod.POST)
	public String backtohome(@ModelAttribute Product product) {
		System.out.println("Start");
		productService.insertData(product);
		
		System.out.println("End");
		
		return "redirect:/";
		
	}
	@RequestMapping("/addproduct")
	public String add() {
		return "addproduct";
	}
	@RequestMapping("/delete/{productID}")
	public String delete(@PathVariable("productID") int id) {
		productService.delete(id);
		return "redirect:/";
	}
	
	@RequestMapping("/update/{productID}")
	public String update(@PathVariable("productID") int id,Model m) {
	Product pro=	productService.getOneData(id);
	m.addAttribute("product",pro);
		return "updateform";
	}
    

	
	

}
