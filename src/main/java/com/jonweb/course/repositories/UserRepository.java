package com.jonweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
