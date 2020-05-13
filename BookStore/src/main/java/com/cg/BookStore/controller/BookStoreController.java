package com.cg.BookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.BookStore.dto.Product;
import com.cg.BookStore.service.BookStoreServiceImpl;

@CrossOrigin(origins = "*" , allowedHeaders = "*")
@RestController
public class BookStoreController {
	
	//Admin Controller functions
	
	@Autowired
	private BookStoreServiceImpl bookServiceImpl;
	
	@PostMapping("/addProduct")
	public ResponseEntity<?> addProduct(@RequestBody Product product)
	{
		Product newProduct = bookServiceImpl.addProduct(product);
		if(newProduct!=null)
		{
			return new ResponseEntity<Product>(newProduct,HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("No product added",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/deleteProduct")
	public ResponseEntity<?> deleteProduct(@RequestParam("productId") Integer productId)
	{
		boolean isProductDeleted = bookServiceImpl.deleteProduct(productId);
		if(isProductDeleted == true)
		{
			return new ResponseEntity<String>("Product deleted successfully",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("Product not deleted",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/viewProducts")
	public ResponseEntity<?> viewProducts()
	{
		List<Product> listOfProducts = bookServiceImpl.viewProducts();
		if(listOfProducts!=null)
		{
			return new ResponseEntity<List>(listOfProducts,HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("No element found in the product list",HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	@PutMapping("/updateProduct")
	public ResponseEntity<?> updateProducts(@RequestParam("productId") Integer productId,@RequestBody Product product)
	{
		Product updatedProduct = bookServiceImpl.updateProduct(productId, product);
		if(updatedProduct!=null)
		{
			return new ResponseEntity<Product>(updatedProduct,HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("Product not updated",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
	
	
	

}
