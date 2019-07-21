package com.my.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.my.springboot.dao.BurgerDao;
import com.my.springboot.model.Burger;

@Controller
@RequestMapping(value = "orders") // Rest API rest end point
public class OrderController {
	
	@Autowired // To connect the dao and controller
	public BurgerDao burgerDao; // inject the customer dao class to the controller

	@RequestMapping(value = "/orders", produces="application/json", method = RequestMethod.GET) // push mapping
	public ResponseEntity<List<Burger>> burgerInformation() {
		List<Burger> burgers = burgerDao.getData(); // get the data from dao
		return new ResponseEntity<List<Burger>>(burgers, HttpStatus.OK) ; // Get mapping annotation returns a jason object
	}
		
	@GetMapping("/view") // Show the orders.html
	public String burgerInformationView() {
		return "orders"	;
	}
}

