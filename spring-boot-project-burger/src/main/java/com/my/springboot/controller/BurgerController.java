package com.my.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriComponentsBuilder;

import com.my.springboot.dao.BurgerDao;
import com.my.springboot.model.Burger;

@Controller
@RequestMapping(value = "/") // Rest API rest end point
public class BurgerController {

	@Autowired  //To connect the dao and controller
	public BurgerDao burgerDao; // inject the  customer dao class to the controller
	//when someone call to rest API it automatically comes get data from dao
	
	@GetMapping("/")
	public String burger() {
		return "/burger"; // go to burger.html page
	}
	
	
	@RequestMapping(value = "/", produces="application/json", method = RequestMethod.POST) // Since this is POST it will auto re
	//UriComponentsBuilder: To create a new object when httpRequest

	public ResponseEntity<?> createUser(@RequestBody Burger burger, UriComponentsBuilder ucBuilder) { 
		
		burgerDao.saveBurger(burger);//Call saveIcecream method in Dao class
		
	    HttpHeaders headers = new HttpHeaders(); //send parameters
	    return new ResponseEntity<List>(headers, HttpStatus.CREATED);
	}

}
