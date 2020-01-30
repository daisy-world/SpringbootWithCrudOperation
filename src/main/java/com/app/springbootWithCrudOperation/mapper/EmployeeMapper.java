package com.app.springbootWithCrudOperation.mapper;


import org.codehaus.jackson.annotate.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

public class EmployeeMapper {
	
	@JsonProperty("employeeId")
	private int employeeId;
	
	
	@NotEmpty
	@JsonProperty("firstName")
	private String firstName;
	
	@NotEmpty
	@JsonProperty("lastName")
	private String lastName;
	
	
	@JsonProperty("salary")
	private double salary;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}


	
	

}
