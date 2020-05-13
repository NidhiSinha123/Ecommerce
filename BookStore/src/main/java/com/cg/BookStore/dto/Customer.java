package com.cg.BookStore.dto;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


import lombok.Data;

@Entity
@Data
public class Customer extends User{

	@Column(name = "customer_phoneNo")
	private BigInteger phoneNo;
	
	@OneToMany(mappedBy="customer")
    private List<Payment> paymentHistory;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Shipping address; 
	 
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cartId", referencedColumnName = "cartId")
	private Cart cart;
	 
 

}
