package com.globallogic.allmapping.entity;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.*;

@Entity
@Table(name="teacher")
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	@Column
	String name;
	@Column
	String subject;
	

}
