package com.serializationdeserialize;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = -766565837700764483L;
	
	long id;
    String location;
	String department;
	
	public Employee(long id, String location, String department) {
		super();
		this.id = id;
		this.location = location;
		this.department = department;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", location=" + location + ", department=" + department + "]";
	}
	
	
}
