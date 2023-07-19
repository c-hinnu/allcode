package com.example.event.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.event.model.Order;

public interface OrderRepository extends JpaRepository<Order,String> {

}
