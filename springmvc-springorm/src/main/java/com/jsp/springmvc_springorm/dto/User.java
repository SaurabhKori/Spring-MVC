package com.jsp.springmvc_springorm.dto;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapKey;

import org.hibernate.annotations.CollectionType;
import org.hibernate.annotations.ForeignKey;
import org.hibernate.annotations.ListIndexBase;
import org.hibernate.annotations.Type;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userID;
	private String userName;
	private String userEmail;
	private long userPhone;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_courses")
	private List<Course> courses; 
	
	private String gender;
//	@DateTimeFormat(pattern = "dd-MM-YYYY")
	private LocalDate dob;
	
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="pin")
    private Address address;
	private String userPass;
	public User(String userName, String userEmail, long userPhone, List<Course> courses, String gender, LocalDate dob,Address address,
			 String userPass) {
		
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.courses = courses;
		this.gender = gender;
		this.dob = dob;
		this.address = address;
		this.userPass = userPass;
	}
	
	

}
