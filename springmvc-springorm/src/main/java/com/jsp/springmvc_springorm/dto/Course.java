package com.jsp.springmvc_springorm.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
private String courses;
public Course(String courses) {
	
	this.courses = courses;
}

}
