package com.project.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.backend.entities.Category;
import com.project.backend.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository categotyRepository;
	
	public List<Category> findAll(){
		return categotyRepository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = categotyRepository.findById(id);
		return obj.get();
	}
	 
}
