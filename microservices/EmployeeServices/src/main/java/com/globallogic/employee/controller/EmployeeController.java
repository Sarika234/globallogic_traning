package com.globallogic.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.globallogic.employee.entity.EmployeeEntity;
import com.globallogic.employee.service.EmployeeServices;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	
	@Autowired
	private EmployeeServices employeeServices;
	
	
	@GetMapping("/")
	public List<EmployeeEntity> getEmployee() {
          return employeeServices.getEmployee();
	}

	@PostMapping("/")
	public void addEmployee(@RequestBody EmployeeEntity emp) {
		employeeServices.addEmployee(emp);
	}
    
	@PutMapping("/")
	public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity emp) {
		return updateEmployee(emp);
	}

	@DeleteMapping("/")
	public void deleteEmployee(long id) {
		deleteEmployee(id);
	}

}
