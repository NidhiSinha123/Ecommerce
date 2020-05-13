package com.cg.BookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.BookStore.dto.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

}
