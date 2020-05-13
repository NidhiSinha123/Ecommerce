package com.cg.BookStore.service;

import java.util.List;

import com.cg.BookStore.dto.Product;

public interface BookStoreService {

	Product addProduct(Product product);
	boolean deleteProduct(Integer productId);
	Product updateProduct(Integer productId,Product product);
	List<Product> viewProducts();
	
}
