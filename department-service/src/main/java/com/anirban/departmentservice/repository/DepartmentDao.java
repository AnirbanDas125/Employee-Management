package com.anirban.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anirban.departmentservice.entity.Department;



public interface DepartmentDao extends JpaRepository<Department,Long> {

}
