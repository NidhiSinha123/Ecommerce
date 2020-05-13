package com.cg.BookStore.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.BookStore.dto.Product;
import com.cg.BookStore.repository.ProductRepository;

@Service
@Transactional
public class BookStoreServiceImpl implements BookStoreService{

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public boolean deleteProduct(Integer productId) {
		// TODO Auto-generated method stub
		Product product = productRepository.findById(productId).get();
		if(product!=null)
		{
			product.setDeleted(true);
			return true;
		}
		else
		{
			return false;
		}
		
	}

	@Override
	public Product updateProduct(Integer productId, Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> viewProducts() {
		// TODO Auto-generated method stub
		return null;
	}

}
