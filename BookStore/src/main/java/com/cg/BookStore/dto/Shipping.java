package com.cg.BookStore.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "shipping")
public class Shipping {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@Column(name="pin_code")
	private Integer pinCode;
	
	@Column(name = "street_no")
	private Integer streetNo;
	
	@Column(name = "landmark")
	private String landMark;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@OneToOne(mappedBy = "address")
    private Customer customer;
	
	@Column(name = "isDeleted")
	private Integer isDeleted;
	 
	

}
