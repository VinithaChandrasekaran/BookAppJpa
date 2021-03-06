package com.vinitha.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vinitha.user.Order;


@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
public List<Order> findByUserIdOrderByIdDesc(int userid);
	
	public List<Order> findByOrderByIdDesc();
	

}
