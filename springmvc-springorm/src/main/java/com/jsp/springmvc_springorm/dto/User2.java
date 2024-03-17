package com.jsp.springmvc_springorm.dto;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User2 {

	private String userName;
	private String userEmail;
	private long userPhone;
	private List<String> courses;
	private String gender;
//	@DateTimeFormat(pattern = "YYYY-MM-DD")
	private String dob;
	
	@ManyToOne
	private Address address;
	private String userPass;
	

}
