package com.cg.BookStore.dto;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Payment")
@Data
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="payment_id")
	private Integer paymentId;
	
	@Column(name = "payment_amount")
	private Integer paymentAmount;
	
	@Column(name = "transaction_id")
	private String transactionId;
	
	@Column(name = "payment_date")
	private LocalDateTime date;
	
	@Column(name = "payment_status")
	private boolean paymentStatus;
	
	@Column(name = "isDeleted")
	private Integer isDeleted;

	@ManyToOne
    @JoinColumn(name="user_id")
    private Customer customer;
	

}
