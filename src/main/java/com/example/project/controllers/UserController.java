package com.example.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Models.User;
import com.example.project.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userSc;

	@RequestMapping(value = "user/{id}", method = RequestMethod.GET)
	public ResponseEntity<User> getUser(@PathVariable int id) {
		return new ResponseEntity<>(userSc.getUser(id), HttpStatus.OK);
	}

	@RequestMapping(value = "user/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteUser(@PathVariable int id) {
		userSc.deleteUser(id);
		return new ResponseEntity<>("User deleted", HttpStatus.OK);
	}

	@RequestMapping(value = "user", method = RequestMethod.POST)
	public ResponseEntity<String> addUser(@RequestBody User user) {
		userSc.addUser(user);
		return new ResponseEntity<String>("User added", HttpStatus.OK);
	}

	@RequestMapping(value = "user/", method = RequestMethod.POST)
	public ResponseEntity<List<User>> getAllUsers() {
		return new ResponseEntity<List<User>>(userSc.getAllUsers(), HttpStatus.OK);
	}
}
