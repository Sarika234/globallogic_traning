package com.globallogic.allmapping.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.globallogic.allmapping.entity.EmployeeEntity;

@Component
public interface EmployeeServies {
	
	public void addEmployee(EmployeeEntity emp);

}
