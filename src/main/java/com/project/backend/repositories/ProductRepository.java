package com.project.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.backend.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
