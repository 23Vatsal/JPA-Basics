package com.learning.jpa.jpademo.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.jpa.jpademo.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
