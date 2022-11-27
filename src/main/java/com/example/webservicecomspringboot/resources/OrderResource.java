package com.example.webservicecomspringboot.resources;

import com.example.webservicecomspringboot.entities.Order;
import com.example.webservicecomspringboot.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = ("/order"))
public class OrderResource {

    @Autowired
    private OrderService orderService;

    @GetMapping(path = "/findallorder")
    public ResponseEntity<List<Order>> findAll() {
        List<Order> orderList = orderService.findAll();
        return ResponseEntity.ok().body(orderList);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<Order>> findByID(@PathVariable Long id) {
        Optional<Order> order = orderService.findByID(id);
        return ResponseEntity.ok().body(order);
    }


}
