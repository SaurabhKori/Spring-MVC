package com.jsp.springmvc_springorm.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	@Id
	private long pin;
	private String vill;
	private String city;
	private String state;
	

}
