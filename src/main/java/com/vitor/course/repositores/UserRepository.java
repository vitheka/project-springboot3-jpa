package com.vitor.course.repositores;

//repository responsável por instanciar no db
import org.springframework.data.jpa.repository.JpaRepository;

import com.vitor.course.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
