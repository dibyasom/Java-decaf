package com.whatupDibya;

public class Department implements Cloneable{
	
	String dname;
	
	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Department(String dname) {
		super();
		this.dname = dname;
	}

	@Override
	public Department clone() throws CloneNotSupportedException {
		return (Department)super.clone();
	}
	
	@Override 
	public String toString() {
		return "Department "+ this.dname+ " !";
	}
	
}
