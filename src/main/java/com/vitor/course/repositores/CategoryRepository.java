package com.vitor.course.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitor.course.entites.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
