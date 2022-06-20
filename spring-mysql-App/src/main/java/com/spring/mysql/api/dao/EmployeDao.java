package com.spring.mysql.api.dao;


import org.springframework.data.repository.CrudRepository;
import com.spring.mysql.api.model.Employee;

public interface EmployeDao extends CrudRepository<Employee, Integer> {

}
