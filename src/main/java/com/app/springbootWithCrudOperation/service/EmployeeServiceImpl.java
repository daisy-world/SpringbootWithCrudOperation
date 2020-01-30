package com.app.springbootWithCrudOperation.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.springbootWithCrudOperation.dao.EmployeeRepository;
import com.app.springbootWithCrudOperation.mapper.EmployeeMapper;
import com.app.springbootWithCrudOperation.model.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	

	@Override
	public Employee createEmployee(EmployeeMapper employee) {
		
		Employee emp = new Employee();
		emp.setFirstName(employee.getFirstName());
		emp.setLastName(employee.getLastName());
		emp.setSalary(employee.getSalary());
	
		return employeeRepository.save(emp);
	}

	@Override
	public List<Employee> getAllEmployees() {
		 return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		  return employeeRepository.findOne(id);
	}

	@Override
	public Employee updateEmployee(int id,EmployeeMapper employee) {
		
			Employee emp = getEmployeeById(id);
	
			emp.setLastName(employee.getLastName());
			emp.setSalary(employee.getSalary());
			
			Employee updatedEmployee = employeeRepository.save(emp);

		return updatedEmployee;
	}

	@Override
	public void deleteEmployee(int id) {
	Employee employee = getEmployeeById(id);
	employeeRepository.delete(employee);

	}
	
	

}
