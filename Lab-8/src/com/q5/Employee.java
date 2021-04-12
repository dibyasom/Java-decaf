package com.q5;

public class Employee {
	
	String name;
	Integer age;
	
	private Employee(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	public static Employee checkAndHire(String name, Integer age) throws InvalidNameException, AgeViolationException{
		if(name.matches("[0-9]+"))
			throw new InvalidNameException("You're human or bot?");
		else if(age > 50)
			throw new AgeViolationException("Take rest man!");
		else {			
			return new Employee(name, age);
		}
	}
}
