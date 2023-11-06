package com.anirban.departmentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anirban.departmentservice.repository.DepartmentDao;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentDao departmentDao;

}
