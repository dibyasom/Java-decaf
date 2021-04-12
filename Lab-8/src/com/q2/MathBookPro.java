package com.q2;

public class MathBookPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] divisors = {1,2,3,0,5,6,8,0,1,6,8,0};
		Integer dividend = 100;
		
		for(Integer div: divisors) {
			try {
				System.out.print(dividend+ " / "+ div + " = ");
				System.out.println((dividend/div));
			} catch (Exception e) {
				System.out.println(" INFINITY [handled exception*]");
			}
		}
		
	}

}
