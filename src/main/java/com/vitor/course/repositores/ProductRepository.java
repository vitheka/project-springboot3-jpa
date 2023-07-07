package com.vitor.course.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitor.course.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
