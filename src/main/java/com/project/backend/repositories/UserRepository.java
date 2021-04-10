package com.project.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.backend.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
