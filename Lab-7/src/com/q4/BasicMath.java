package com.q4;

public class BasicMath implements myInterface{

	@Override
	public double division(double a, double b) {
		// TODO Auto-generated method stub
		return (b!=0.0) ?a/b :-1;
	}

	@Override
	public long modules(long a, long b) {
		// TODO Auto-generated method stub
		return a%b;
	}

}
