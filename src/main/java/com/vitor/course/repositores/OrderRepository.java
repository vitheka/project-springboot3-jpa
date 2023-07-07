package com.vitor.course.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitor.course.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
