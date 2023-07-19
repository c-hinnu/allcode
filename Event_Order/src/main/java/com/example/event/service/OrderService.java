package com.example.event.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.event.controller.OrderController;
import com.example.event.model.Order;
import com.example.event.repository.OrderRepo;

@Service
public class OrderService {
	@Autowired
	private OrderRepo orderrepo;
	@Autowired
	RestTemplate tp;

public Order findOrderByCode(String id) {
		Optional<Order> result = orderrepo.findById(id);
		Order order=result.get();
		return order;
	}

public void addOrder(Order order) {
	orderrepo.save(order);	
}

public List<Order> getAllOrders() {
	return orderrepo.findAll();
}

public void deleteOrder(String id) {
	orderrepo.deleteById(id);
	
}

public void updateOrder(Order order) {
	Optional<Order> result = orderrepo.findById(order.getOrder_id());
	result.get().setAmount(order.getAmount());
		/*
		 * result.get().setCustomer_id(order.getCustomer_id());
		 * result.get().setEvent_id(order.getEvent_id());
		 * result.get().setOrder_date(order.getOrder_date());
		 */
	orderrepo.save(order);
	
}

public ResponseEntity<?> GetAllEvents() {
	ResponseEntity re=tp.getForEntity("http://localhost:8092/events",String.class);
	return re;
}



}
