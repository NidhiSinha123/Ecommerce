package com.cg.BookStore.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Cart")
@Data
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cartId")
	private Integer cartId;

	@Column(name = "total_price")
	private double totalPrice;

	@Column(name = "status")
	private boolean status;

	@OneToOne(mappedBy = "cart")
    private Customer customer;
	 

	@OneToMany
	@JoinColumn(name = "cart_id_fk")
	private List<Product> listOfProducts = new ArrayList<Product>();

	@Column(name = "isDeleted")
	private Integer isDeleted;
}
