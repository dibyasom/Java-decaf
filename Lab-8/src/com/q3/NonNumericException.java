package com.q3;

public class NonNumericException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	NonNumericException(String msg){
		super("Custom Exception Thrown: "+msg);
	}
}
