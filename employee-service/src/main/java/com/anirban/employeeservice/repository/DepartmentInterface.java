package com.anirban.employeeservice.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.anirban.employeeservice.wrappers.Department;



@FeignClient("DEPARTMENT-SERVICE")
public interface DepartmentInterface {
	
	@GetMapping("departments/find/{departmentId}")
	public ResponseEntity<Department> findDepartmentById(@PathVariable long departmentId);

}
