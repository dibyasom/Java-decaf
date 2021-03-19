package com.whatupDibya;

public class Employee implements Cloneable{
	
	private int id;
	private String name;
	private Department dep;
	
	
	public Employee(int id, String name, Department dep) {
		super();
		this.id = id;
		this.name = name;
		this.dep = dep;
	}
	
	@Override
	public Employee clone() throws CloneNotSupportedException {
		Employee tempEmp = (Employee)super.clone();
		tempEmp.setDep(tempEmp.getDep().clone());
		return tempEmp;
	}
	
	@Override 
	public String toString() {
		return "Hello "+ this.name+ "/"+ this.id+ " of "+ dep;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDep() {
		return dep;
	}

	public void setDep(Department dep) {
		this.dep = dep;
	}

	public void show() {
		System.out.println(this);
	}

}
