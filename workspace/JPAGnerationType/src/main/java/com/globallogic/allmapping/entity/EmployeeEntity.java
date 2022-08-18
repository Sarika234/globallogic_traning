package com.globallogic.allmapping.entity;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class EmployeeEntity {

	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public EmployeeEntity()
	{
		
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EmployeeEntity(long id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Id  //it will mark this as primary key 
	//GenerationType.IDENTITY --it will mark this column as auto_increment 
	// GenerationType.AUTO --it is depend on the vendor of database what type they can choose
	//GenerationType.SEQUENCE --it will create a table with name sequence and take the next value for each row
	//GenerationType.TABLE  --you are use different or same database and different table other than sequenece
	
	//AUTO --it will choose IDENTITY , SEQUENCE
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	long id;
	
	@Column(name="employee_Name", length=50)
	String name;
	
	@Column(name="employee_Salary")
	double salary;
	
}
