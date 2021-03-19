package com.whatupDibya;

public class Main {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		//Generating a new employee using constructor.
		Department myDep = new Department("AIML");
		Employee myEmp = new Employee(500076104, "Dibyasom", myDep);
		
		//Generate Clone of employee.
		Employee myNewEmp = myEmp.clone();
		myNewEmp.setId(500076501);
		myNewEmp.setName("Dija");
		myNewEmp.getDep().setDname("CCVT");
		
		//Display employee data.
		myEmp.show();
		myNewEmp.show();
	}
}
