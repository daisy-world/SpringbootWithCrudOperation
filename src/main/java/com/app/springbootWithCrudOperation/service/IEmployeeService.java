package com.app.springbootWithCrudOperation.service;


import java.util.List;

import com.app.springbootWithCrudOperation.mapper.EmployeeMapper;
import com.app.springbootWithCrudOperation.model.Employee;


public interface IEmployeeService {
	
	public Employee createEmployee(EmployeeMapper employee);
	
	public List<Employee> getAllEmployees();
	
	public Employee getEmployeeById(int id);
	
	public Employee updateEmployee(int id,EmployeeMapper employee);
	
	public void deleteEmployee(int id);

}
