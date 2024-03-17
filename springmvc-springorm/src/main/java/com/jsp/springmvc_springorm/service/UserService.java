package com.jsp.springmvc_springorm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springmvc_springorm.dao.UserDao;
import com.jsp.springmvc_springorm.dto.Address;
import com.jsp.springmvc_springorm.dto.User;
@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	public void insert(User user) {
		
		System.out.println(user);
		userDao.save(user);
	}
	public void getAllData() {
		userDao.getAllData();
	}

}
