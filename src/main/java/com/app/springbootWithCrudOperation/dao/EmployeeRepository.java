package com.app.springbootWithCrudOperation.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.springbootWithCrudOperation.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{


}
