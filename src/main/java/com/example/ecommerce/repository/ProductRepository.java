package com.example.ecommerce.repository;

import com.example.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200") // Accept calls from browser scripts for this origin (protocol + hostname + port)
public interface ProductRepository extends JpaRepository<Product, Long> {

}
