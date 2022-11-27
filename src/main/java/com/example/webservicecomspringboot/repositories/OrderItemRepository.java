package com.example.webservicecomspringboot.repositories;


import com.example.webservicecomspringboot.entities.OrderItem;
import com.example.webservicecomspringboot.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository <OrderItem, Long> {
}
