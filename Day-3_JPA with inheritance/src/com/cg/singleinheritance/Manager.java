package com.cg.singleinheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MNG")
//@table is not used because it is single inheritance we only need one table 

public class Manager extends Employee 
{
	private static final long serialVersionUID = 1L;
	private String deptname;
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	
	
}
