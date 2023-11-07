package com.anirban.departmentservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anirban.departmentservice.entity.Department;
import com.anirban.departmentservice.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	
	@PostMapping("/save")
	public ResponseEntity<String> saveDepartment(@RequestBody Department department){
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Department>> getAllDepartments(){
		return departmentService.getAllDepartments();
	}
	
	@GetMapping("/find/{departmentId}")
	public ResponseEntity<Department> findDepartmentById(@PathVariable long departmentId){
		
		return departmentService.findDepartmentById(departmentId);
		
	}
	
	

}
