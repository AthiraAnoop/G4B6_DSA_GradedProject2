package com.gl.employee;

public class Employee {
	private String firstName;
	private String lastName;
	//private String emailAddress;
	//private String generatePassword;
	
	public Employee(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	public String getLastName() {
		return lastName.toLowerCase();
	}
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	
	
	
}
