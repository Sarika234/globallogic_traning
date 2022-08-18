package com.globallogic.allmapping.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globallogic.allmapping.entity.EmployeeEntity;
import com.globallogic.allmapping.repo.EmployeeRepo;
import com.globallogic.allmapping.services.EmployeeServies;

@Component
public class EmployeeServicesImpl  implements EmployeeServies{

	@Autowired
	EmployeeRepo employeeRepo; 
	
	
	@Override
	public void addEmployee(EmployeeEntity emp) {
		// TODO Auto-generated method stub
		employeeRepo.save(emp);
	}

}
