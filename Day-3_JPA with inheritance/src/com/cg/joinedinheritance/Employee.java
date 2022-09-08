package com.cg.joinedinheritance;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Empolyee2")
@Inheritance(strategy=InheritanceType.JOINED)


public class Employee implements Serializable

{
	private static final long serialVersionUId= 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int EmpId;
	private String name;
	private float salary;
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}