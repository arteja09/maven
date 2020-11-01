package com.example.project.controllers;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Models.Book;
import com.example.project.service.BookService;
import com.example.project.service.BorrowBookService;

@RestController
public class BookController {

	@Autowired
	BookService bookService;

	@RequestMapping(value = "books", method = RequestMethod.GET)
	public ResponseEntity<Book> getBook(@PathVariable int id) {
		return new ResponseEntity<Book>(bookService.getBook(id), HttpStatus.OK);
	}

	@RequestMapping(value = "books/day/{date}", method = RequestMethod.GET)
	public ResponseEntity<List<Book>> getBookByDate(@PathVariable Date date) {
		return new ResponseEntity<List<Book>>(bookService.getBookBydate(date), HttpStatus.OK);
	}

	@RequestMapping(value = "books/", method = RequestMethod.POST)
	public ResponseEntity<List<Book>> getAllBook() {
		return new ResponseEntity<List<Book>>(bookService.getBook(), HttpStatus.OK);
	}

	@RequestMapping(value = "books", method = RequestMethod.POST)
	public ResponseEntity<String> addBook(Book book) {
		bookService.addBook(book);
		return new ResponseEntity<>("book added", HttpStatus.OK);
	}

	@RequestMapping(value = "books/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteBook(@PathVariable int id) {
		bookService.deleteBook(id);
		return new ResponseEntity<>("book deleted", HttpStatus.OK);
	}
}
