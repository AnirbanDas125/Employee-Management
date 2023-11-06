package com.anirban.departmentservice.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Department {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long departmentId;
	private long departmentName;
	private long departmentAddress;
	private long departmentCode;
	
	public Department() {
		
	}
	
	public Department(long departmentId, long departmentName, long departmentAddress, long departmentCode) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
		this.departmentCode = departmentCode;
	}

	public long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}

	public long getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(long departmentName) {
		this.departmentName = departmentName;
	}

	public long getDepartmentAddress() {
		return departmentAddress;
	}

	public void setDepartmentAddress(long departmentAddress) {
		this.departmentAddress = departmentAddress;
	}

	public long getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(long departmentCode) {
		this.departmentCode = departmentCode;
	}
	
	
	

}
