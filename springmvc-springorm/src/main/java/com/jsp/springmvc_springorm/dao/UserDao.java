package com.jsp.springmvc_springorm.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.jsp.springmvc_springorm.dto.Address;
import com.jsp.springmvc_springorm.dto.User;
@Repository
public class UserDao {
	@Autowired
	private HibernateTemplate hibtemp;
	@Transactional
	public void save(User user) {
//		user.setAddress(address);
//		System.out.println(user);
		hibtemp.save(user);
//		System.err.println("end");
	}
	public void getAllData() {
	  hibtemp.loadAll(User.class);
	}

}
