package com.cg.BookStore.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "bookStore_user")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class User {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Integer userId;
	
	@Column(name="user_email")
	private String userEmail;
	
	@Column(name="user_password")
	private String userPassword;
	
	@Column(name="user_role")
	private String userRole;
	
	@Column(name="user_age")
	private Integer userAge;
	
	@Column(name="user_gender")
	private String userGender;
	
	@Column(name = "isDeleted")
	private Integer isDeleted;
	
	
	
}
