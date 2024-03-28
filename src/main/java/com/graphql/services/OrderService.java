package com.graphql.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.graphql.entities.Order;
import com.graphql.helper.ExceptionHelper;
import com.graphql.repositories.OrderRepo;

@Service
public class OrderService {
	private OrderRepo orderRepo;

	public OrderService(OrderRepo orderRepo) {
		super();
		this.orderRepo = orderRepo;
	}

//create order
	public Order createOrder(Order order) {
		return orderRepo.save(order);
	}

	// get all order
	public List<Order> getAllOrders() {
		return orderRepo.findAll();
	}

	// get single order
	public Order getOrder(int orderId) {
		Order order = orderRepo.findById(orderId).orElseThrow(ExceptionHelper::throwResourceNotFoundException);
		return order;
	}

	// delete order
	public boolean deleteOrder(int orderId) {
		Order order = orderRepo.findById(orderId).orElseThrow(ExceptionHelper::throwResourceNotFoundException);
		orderRepo.delete(order);
		return true;
	}

}
