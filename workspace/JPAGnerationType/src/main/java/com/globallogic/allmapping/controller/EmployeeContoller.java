package com.globallogic.allmapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.allmapping.entity.EmployeeEntity;
import com.globallogic.allmapping.repo.EmployeeRepo;
import com.globallogic.allmapping.services.EmployeeServies;

@RestController
@RequestMapping("/employee")
public class EmployeeContoller {
	
	@Autowired
	EmployeeServies servies;

	@PostMapping("/")
	public void addEmployee(@RequestBody EmployeeEntity e)
	{
		servies.addEmployee(e);
	}
	
	/*
	 * @GetMapping("/id/{id}") public EmployeeEntity getEmployee(@PathVariable Long
	 * id) { return employeeRepo.findById(id).get(); }
	 * 
	 * @GetMapping("/name/{name}/salary/{salary}") public List<EmployeeEntity>
	 * getEmployeeByname(@PathVariable String name, @PathVariable double salary) {
	 * 
	 * return employeeRepo.getEmployeeByNameAnndSalary(name,salary); }
	 */
	
	
	

}
