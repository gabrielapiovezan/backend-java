package com.project.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.backend.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
