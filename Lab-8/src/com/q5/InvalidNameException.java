package com.q5;

public class InvalidNameException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	InvalidNameException(String exMsg){
		super(exMsg);
	}
}
