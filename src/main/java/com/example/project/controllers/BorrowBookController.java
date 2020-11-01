package com.example.project.controllers;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Models.Book;
import com.example.project.Models.BorrowBook;
import com.example.project.Repository.BorrowBookRepository;
import com.example.project.service.BorrowBookService;

@RestController
public class BorrowBookController {

	@Autowired
	BorrowBookService borrowBookService;

	@RequestMapping(value = "/borrowbook/{id}", method = RequestMethod.GET)
	public ResponseEntity<BorrowBook> getBorrowBook(@PathVariable int id) {
		return new ResponseEntity<>(borrowBookService.getByID(id), HttpStatus.OK);
	}

	@RequestMapping(value = "/borrowbook", method = RequestMethod.POST)
	public ResponseEntity<String> borrowBook(@RequestBody BorrowBook borrowBook) {
		return new ResponseEntity<>("borrwed book", HttpStatus.OK);
	}
	
	@RequestMapping(value = "/borrowbook/", method = RequestMethod.GET)
	public ResponseEntity<List<BorrowBook>> borrowBookList() {
		return new ResponseEntity<>(borrowBookService.getAllBooks(), HttpStatus.OK);
	}

}
