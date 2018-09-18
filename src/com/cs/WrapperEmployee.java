package com.cs;

import java.util.List;

import javax.validation.Valid;

public class WrapperEmployee {
	
	@Valid
	private List<Employee> employee;

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	
	
	
}
