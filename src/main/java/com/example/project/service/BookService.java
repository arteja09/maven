package com.example.project.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Models.Book;
import com.example.project.Repository.BookRepository;
import com.example.project.Repository.BorrowBookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository bookRepo;
	
	@Autowired
	BorrowBookRepository borrowBookRepository;

	public Book getBook(int id) {
		return bookRepo.findById(id).orElse(new Book());
	}

	public void deleteBook(int id) {
		bookRepo.deleteById(id);
	}

	public List<Book> getBook() {
		return bookRepo.findAll();
	}

	public void addBook(Book book) {
		bookRepo.save(book);
	}

	public List<Book> getBookBydate(Date date) {

		return borrowBookRepository.findByDate(date);
	}

}
