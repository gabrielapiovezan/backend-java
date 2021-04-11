package com.project.backend.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.backend.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductResource {

	@Autowired
	ProductService service;
	
	@GetMapping
	ResponseEntity<List<Product>> findAll(){
		List<Product> list = service.findAll();
	return 	ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/{id}")
	ResponseEntity<Product> findById(@PathVariable Long id){
		Product pt = service.findById(id);
		return ResponseEntity.ok().body(pt);
	}
	
	
}
