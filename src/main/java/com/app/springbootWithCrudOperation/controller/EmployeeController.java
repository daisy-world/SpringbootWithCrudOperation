package com.app.springbootWithCrudOperation.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.springbootWithCrudOperation.mapper.EmployeeMapper;
import com.app.springbootWithCrudOperation.model.Employee;
import com.app.springbootWithCrudOperation.service.IEmployeeService;


@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	@Autowired
	IEmployeeService employeeService;
	
	

    // Create a new Employee
	
	@PostMapping("/")
	public Employee createEmployee(@Valid @RequestBody EmployeeMapper employee) {
		
		System.out.println("inside create employee controller");
	    return employeeService.createEmployee(employee);
	}
	
	// Get a Single Employee
	
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable(value = "id") int employeeId) {
	    return employeeService.getEmployeeById(employeeId);
	}
	
	// Get All Employees
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
	    return employeeService.getAllEmployees();
	}

    // Update an Employee
	
	@PutMapping("/{id}")
	public Employee updateEmployee(@PathVariable(value = "id") int employeeId,
	                                        @Valid @RequestBody EmployeeMapper employeeMapper) {
		
		
	return employeeService.updateEmployee(employeeId, employeeMapper);
		
		
	}

    // Delete an Employee
	
	@DeleteMapping("/{id}")
	public void deleteNote(@PathVariable(value = "id") int employeeId) {
		
		 employeeService.deleteEmployee(employeeId);
	}
	   

}
