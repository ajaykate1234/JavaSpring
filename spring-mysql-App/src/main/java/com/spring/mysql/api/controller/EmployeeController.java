package com.spring.mysql.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.mysql.api.dao.EmployeDao;
import com.spring.mysql.api.model.Employee;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	public EmployeeController(EmployeDao dao) {
		super();
		this.dao = dao;
	}

	@Autowired
	private EmployeDao dao;
	
	@PostMapping("/AddEmployees")
	public String AddEmployee(List<Employee> employees) {
		dao.saveAll(employees);	//here I used saveall instead of save method
		return  "Employee Added :"+ employees.size();
		
	}
	
	@GetMapping("/GetEmployee")
	public List<Employee> getEmployee() {
		return (List<Employee>) dao.findAll();
	}
}
