package com.cs;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class Employee {

	@NotNull(message="Error:name can not be null")
	private String name;
	@Email(message="Error:email is not valid")
	private String email;
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
