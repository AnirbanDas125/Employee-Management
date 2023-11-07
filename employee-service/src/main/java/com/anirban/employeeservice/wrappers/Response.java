package com.anirban.employeeservice.wrappers;

import com.anirban.employeeservice.entity.Employee;

public class Response {
	
	private Employee employee;
	private Department department;
	
	public Response() {
		
	}

	public Response(Employee employee, Department department) {
		super();
		this.employee = employee;
		this.department = department;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	

}
