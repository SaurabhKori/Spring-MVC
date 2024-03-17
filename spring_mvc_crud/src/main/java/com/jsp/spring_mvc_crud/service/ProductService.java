package com.jsp.spring_mvc_crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.spring_mvc_crud.dao.ProductDao;
import com.jsp.spring_mvc_crud.dto.Product;
@Service
public class ProductService {
	@Autowired
	private ProductDao productDao;
	public void insertData(Product pruduct) {
		productDao.insert(pruduct);
		
	}
	public Product getOneData(int id) {
	return	productDao.getOneData(id);
		
	}
	public List<Product> fetchAllData(){
	return	productDao.fetchAlldata();
	}
	public void delete(int id) {
	
	productDao.deleteproduct(id);
	}
   
}
