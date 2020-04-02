package com.example.myproject.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myproject.model.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
