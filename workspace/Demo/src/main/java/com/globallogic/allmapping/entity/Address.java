package com.globallogic.allmapping.entity;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	@Column
	String city;
	@Column
	double pincode;


}
