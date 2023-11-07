package com.anirban.departmentservice.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.anirban.departmentservice.entity.Department;
import com.anirban.departmentservice.repository.DepartmentDao;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentDao departmentDao;

	public ResponseEntity<String> saveDepartment(Department department) {
		try {
			departmentDao.save(department);
		}catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>("Something went wrong :(",HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<>("Successfully Created..!",HttpStatus.CREATED);
		
	}

	public ResponseEntity<List<Department>> getAllDepartments() {
		
		try {
		List<Department> allDeps = departmentDao.findAll();
		return new ResponseEntity<>(allDeps,HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
		}
		
	}

	public ResponseEntity<Department> findDepartmentById(long departmentId) {
		Optional<Department> opDep = departmentDao.findById(departmentId);
		
		if(opDep.isEmpty()) {
			throw new RuntimeException("Department not found by ID "+departmentId);
		}
		
		return new ResponseEntity<>(opDep.get(),HttpStatus.OK);
	}

}
