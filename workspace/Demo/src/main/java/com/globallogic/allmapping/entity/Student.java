package com.globallogic.allmapping.entity;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.*;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	@Column
	long rollno;
	@Column
	double fees;
	
	//creating the One to One mapping
	@OneToOne
	Register  register;	
	
	//creating One to Many mapping
	@OneToMany
	List<Address> address;

   //Many to Many mapping
	@ManyToMany
	List<Teacher> teacher;
	
}
