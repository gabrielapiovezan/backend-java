package com.project.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.backend.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
