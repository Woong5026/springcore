package com.sparta.springcore.repository;

import com.sparta.springcore.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> { }
