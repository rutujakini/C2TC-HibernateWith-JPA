package com.tns.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentId;
	
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Address address;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}


/*
create database test;
use test;
CREATE TABLE TEST.student (
 studentId INT PRIMARY KEY,
 name VARCHAR(45),
 address_id INT REFERENCES ADDRESS1(address_id) );
select * from test.student;

CREATE TABLE TEST.ADDRESS (
 address_id INT PRIMARY KEY, 
 address_street VARCHAR(45), 
 address_city VARCHAR(45), 
 address_state VARCHAR(45), 
 address_zipcode VARCHAR(45) );
 select * from demo.address;
*/