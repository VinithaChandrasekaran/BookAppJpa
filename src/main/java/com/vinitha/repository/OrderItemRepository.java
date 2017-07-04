package com.vinitha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vinitha.user.OrderItem;


@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>  {

}
