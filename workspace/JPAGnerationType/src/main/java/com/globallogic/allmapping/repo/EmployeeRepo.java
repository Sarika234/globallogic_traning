package com.globallogic.allmapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.*;

import com.globallogic.allmapping.entity.EmployeeEntity;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Long>{

	//find the all the matching records
	public List<EmployeeEntity> findByName(String name);
	
	    //all the matching 
	     public List<EmployeeEntity> findBySalary(double salary);
	 
	     //find first with limit
		public List<EmployeeEntity> findFirst1ByName(String name);
		
		//matching with and salary and name
		public List<EmployeeEntity> findBySalaryAndName(double salary,String name);	
		
		//find the lessThan Salary
		public List<EmployeeEntity> findBySalaryLessThan(double salary);
    		
		//find the greater than Salary
		public List<EmployeeEntity> findBySalaryGreaterThan(double salary);
		
		//find all the match with like
		public List<EmployeeEntity> findByNameLike(String name);
		
		//find all the match with name with ignore case
		public List<EmployeeEntity> findByNameContainingIgnoreCase(String name);
		
		//find all the match with like
		//where name!='kumar'
		public List<EmployeeEntity> findByNameNot(String name);
		
		
		//find the salary between range
		public List<EmployeeEntity> findBySalaryBetween(double  start, double end);
				
		
		//find the salary in given list
	  public List<EmployeeEntity> findBySalaryIn(List<Double> ls);
						
		
	   //find the all the matching records
	    @Query("Select e from EmployeeEntity e where e.name=?1")
		public List<EmployeeEntity> getEmployee(String name);
		
	    //find the all the matching records
	    @Query("Select e from EmployeeEntity e where e.name=:name")
		public List<EmployeeEntity> getEmployeeByName(String name);
		
				
	    //find the all the matching records
	    @Query("Select e from EmployeeEntity e where e.name=:name and e.salary=:salary")
		public List<EmployeeEntity> getEmployeeByNameAnndSalary(String name,double salary);
				
		    	
}
