package com.anirban.employeeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anirban.employeeservice.entity.Employee;
import com.anirban.employeeservice.service.EmployeeService;
import com.anirban.employeeservice.wrappers.Response;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveUser(@RequestBody Employee employee){
		return employeeService.saveUser(employee);
	}
	
	@GetMapping("/get-employee/{employeeId}")
	public ResponseEntity<Response> getEmployeeWithDepartment(@PathVariable long employeeId){
		return employeeService.getEmployeeWithDepartment(employeeId);
	}

}
