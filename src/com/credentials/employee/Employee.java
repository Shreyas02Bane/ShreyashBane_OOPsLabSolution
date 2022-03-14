package com.credentials.employee;


public class Employee {
	
	String firstName, lastName;
	
	
	public Employee(String fName, String lName){
		this.firstName = fName;
		this.lastName = lName;
	}


	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	
	
}
