package com.graphql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graphql.entities.Order;

public interface OrderRepo extends JpaRepository<Order,Integer> {

}
