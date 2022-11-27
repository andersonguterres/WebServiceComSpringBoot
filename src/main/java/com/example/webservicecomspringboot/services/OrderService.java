package com.example.webservicecomspringboot.services;

import com.example.webservicecomspringboot.entities.Order;
import com.example.webservicecomspringboot.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Optional<Order> findByID(Long id) {
        return orderRepository.findById(id);
    }

}
