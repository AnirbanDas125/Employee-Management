package com.anirban.employeeservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.anirban.employeeservice.entity.Employee;
import com.anirban.employeeservice.repository.DepartmentInterface;
import com.anirban.employeeservice.repository.EmployeeDao;
import com.anirban.employeeservice.wrappers.Department;
import com.anirban.employeeservice.wrappers.Response;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Autowired
	private DepartmentInterface departmentInterface;

	public ResponseEntity<String> saveUser(Employee employee) {
		try { 
		employeeDao.save(employee);
		}catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>("Employee could not be added :(",HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<>("Employee Successfully added...",HttpStatus.OK);
	}

	public ResponseEntity<Response> getEmployeeWithDepartment(long employeeId) {
		
		Response response = new Response();
		Optional<Employee> opEmployee = employeeDao.findById(employeeId);
		
		if(opEmployee.isEmpty()) {
			throw new RuntimeException("Employee could not found by Id "+employeeId);
		}
		
		Department opDepartment = departmentInterface.findDepartmentById(opEmployee.get().getDepartmentId()).getBody();
		
		response.setEmployee(opEmployee.get());
		response.setDepartment(opDepartment);
		
		return new ResponseEntity<>(response,HttpStatus.OK);
		
	}
	

}
