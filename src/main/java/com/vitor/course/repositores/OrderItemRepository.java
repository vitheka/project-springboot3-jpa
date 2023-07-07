package com.vitor.course.repositores;

//repository responsável por instanciar no db
import org.springframework.data.jpa.repository.JpaRepository;

import com.vitor.course.entites.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
