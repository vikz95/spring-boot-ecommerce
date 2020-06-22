package com.example.ecommerce.repository;

import com.example.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin("http://localhost:4200") // Accept calls from browser scripts for this origin (protocol + hostname + port)
public interface ProductRepository extends JpaRepository<Product, Long> {

    // The url will be: .../api/products/search/findByCategoryId?id={id}
    Page<Product> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);

    // The url will be: .../api/products/search/findByNameContaining?name={name}
    Page<Product> findByNameContaining(@RequestParam("name") String name, Pageable pageable);
}
