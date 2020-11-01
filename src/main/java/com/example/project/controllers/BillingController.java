package com.example.project.controllers;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Models.Billing;
import com.example.project.service.BillingService;

@RestController
public class BillingController {

	@Autowired
	BillingService billingService;
	
	@RequestMapping(value="/billing/getbill/{id}",method = RequestMethod.GET)
	public ResponseEntity<Billing> getBill(int id) {
		return new ResponseEntity<>(billingService.getBookId(id),HttpStatus.OK);
	}
	
	@RequestMapping(value="/billing/{borrowbookid}",method = RequestMethod.POST)
	public Billing getBillByBookId(int id) {
		return null;
	}

}
