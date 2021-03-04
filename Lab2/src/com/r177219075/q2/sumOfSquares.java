package com.r177219075.q2;

import java.util.*; // For scanner.

public class sumOfSquares {

	static class solution{
		
		public long sumOfSquare(Integer[] numNum) {
			long ssq = 0;
			for(Integer val: numNum)
				ssq += (long)(val*val);
			
			return ssq;
		}
	}
	public static void main(String[] args) {
		
		//Fetch 3-digits from user.
		Integer[] numNum = new Integer[10];
		Scanner input = new Scanner (System.in);
		System.out.println("Drop 10 integers.");
		for(int i=0; i<10; i++) 
			numNum[i] = input.nextInt();		
		input.close();
		
		//Calculate and Display sum of squares.
		solution sol = new solution();
		System.out.println("Sum of Squares: " + sol.sumOfSquare(numNum));
	}
}
