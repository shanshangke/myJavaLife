package com.example.myproject.service;

import java.util.List;

import com.example.myproject.model.entity.User;

public interface UserService {
	User save(User user);
	void delete(User user);
	List<User> findAll();
}
