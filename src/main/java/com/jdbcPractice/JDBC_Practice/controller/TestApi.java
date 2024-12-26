package com.jdbcPractice.JDBC_Practice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jdbcPractice.JDBC_Practice.entity.Employee;

@RestController
public class TestApi {
// http://localhost:9090/api
	@GetMapping("/api")
	public String test() {
		return "Hello World";
	}
//	http://localhost:9090/api/tabrez
	@GetMapping("/api/{name}")
	public String test1(@PathVariable String name) {
		return "Hello "+name;
	}
	
//	http://localhost:9090/param?firstName=tabrez&lastName=mohammed
	@GetMapping("/param")
	public String test2(@RequestParam String firstName, @RequestParam String lastName) {
		return "Your full name is "+firstName+" "+lastName;
	}
	
	@PostMapping("/body")
	public String bodyTest(@RequestBody Employee emp) {
		return "Employee inserted";
	}
	
//	http://localhost:9090/body/details in postman
	@PostMapping("/body/details")
	public String bodyTest1(@RequestBody Employee emp) {
		return emp.toString();
	}
	
	
	
	
	
}
