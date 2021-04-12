package com.q5;

public class Company {
		
	public static void main(String[] args) {
		Employee emp;
		try {
			emp = Employee.checkAndHire("Rexxxxxu", 49);
			System.out.println("You, Mr/Ms" + emp.name + " @" + emp.age+ " years, are hired!" );
		} catch (InvalidNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Plis change your name to work in Dibya.inc");
		} catch (AgeViolationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Get a little younger plis.");
		}
		
		System.out.println("Hiring drive is over!");
	}
}
