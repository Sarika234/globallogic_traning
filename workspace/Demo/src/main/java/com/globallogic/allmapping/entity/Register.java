package com.globallogic.allmapping.entity;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name="register")
public class Register {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	@Column
	String name;
	@Column
	String city;

}
