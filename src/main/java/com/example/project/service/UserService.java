package com.example.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Models.Billing;
import com.example.project.Models.User;
import com.example.project.Repository.BillingRepository;
import com.example.project.Repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;

	public User getUser(int id) {
		return userRepo.findById(id).orElse(new User());
	}

	public void addUser(User user) {
		userRepo.save(user);
	}

	public void deleteUser(int id) {
		userRepo.deleteById(id);
	}

	public void deleteUser(User user) {
		userRepo.delete(user);
	}

	public List<User> getAllUsers() {
		return userRepo.findAll();
	}
}
