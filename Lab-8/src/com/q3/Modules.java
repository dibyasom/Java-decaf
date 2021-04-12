package com.q3;

public class Modules {

	public static void main(String[] args) throws NonNumericException {
		// TODO Auto-generated method stub
		
		// Var to hold cli values received.
		Integer a,b;
		try {
			a = Integer.valueOf(args[0]);
			b = Integer.valueOf(args[1]);
			System.out.println("Modulo result : " + (a%b));
		} catch (Exception e) {
			if( !args[0].matches("[0-9]") || !args[1].matches("[0-9]"))
				throw new NonNumericException("Expected Integer type, received Non-Numeric type.");
		}
	}

}
