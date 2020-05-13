package com.cg.BookStore.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerators;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Setter
@Getter
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
	private Integer productId;
	
	@Column(name = "product_description")
	private String productDescription;
	
	@Column(name = "product_price")
	private Double productPrice;
	
	@Column(name = "product_quantity")
	private Integer productQuantity;
	
	@Lob
	@Column(name = "product_image", columnDefinition="BLOB")
	private byte[] photo;
	
	@Column(name = "isDeleted")
	private boolean isDeleted;
	
	
	
}
