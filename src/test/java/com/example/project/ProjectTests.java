package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


import org.junit.Before;
import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.example.project.Models.Billing;
import com.example.project.Models.Book;
import com.example.project.Models.BorrowBook;
import com.example.project.Models.User;
import com.example.project.Repository.BillingRepository;
import com.example.project.Repository.BookRepository;
import com.example.project.Repository.BorrowBookRepository;
import com.example.project.Repository.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)	
public class ProjectTests {

	
private MockMvc mockMvc; 
	

	@Autowired
	WebApplicationContext context;
	
	@Autowired
	private BookRepository br;
	
	@Autowired
	private UserRepository ur;
	@Autowired
	private BillingRepository billr;
	@Autowired
	private BorrowBookRepository bbr;
	@Before
	  public void setup() throws Exception {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	  }
		
	@Test
	public void addUser_test() throws Exception{
		assertEquals("abc","abc");
	}
	@Test
	public void addBook_test() throws Exception{
		assertEquals("abc","abc");
	}
	
	@Test
	public void borrowBook_test() throws Exception{
		assertEquals("abc","abc");
	}
	
	
	
	
	
	private byte[] toJson(Object r) throws Exception {
        ObjectMapper map = new ObjectMapper();
        return map.writeValueAsString(r).getBytes();
        }
}
