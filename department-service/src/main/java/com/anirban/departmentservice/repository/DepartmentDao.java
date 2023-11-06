package com.anirban.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anirban.departmentservice.entity.Department;

@Repository
public interface DepartmentDao extends JpaRepository<Department,Long> {

}
