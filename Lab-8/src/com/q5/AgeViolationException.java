package com.q5;

public class AgeViolationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	AgeViolationException (String exMsg){
		super(exMsg);
	}
}
