package com.jsp.spring_mvc_crud.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.jsp.spring_mvc_crud.dto.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Repository
public class ProductDao {
	@Autowired
	private HibernateTemplate hibtemp;
	//Insert Product data
	@Transactional
	public void insert(Product product) {
		hibtemp.saveOrUpdate(product);
	}
//	get one data from table
	public Product getOneData(int id) {
		return hibtemp.get(Product.class, id);
	}
//	fetch All data of Product
	public List<Product> fetchAlldata(){
		return hibtemp.loadAll(Product.class);
	}
//	delete product data
	@Transactional
	public void deleteproduct(int id) {
		hibtemp.delete(getOneData(id));
		
	}
		
	

}
