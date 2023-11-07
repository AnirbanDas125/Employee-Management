package com.anirban.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anirban.employeeservice.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee,Long> {

}
