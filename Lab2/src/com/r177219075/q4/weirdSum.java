package com.r177219075.q4;

public class weirdSum {
	static class solution{
		public int sumInRange(int low, int high) {
			int sum = 0;
			for(int i=low; i<=high; i++)
				if(i%5==0)
					sum+=i;
			return sum;
		}
	}
	
	public static void main(String[] args) {
		//Get the sum, and display.
		solution sol = new solution();
		System.out.println("Sum of {x:x, x_mod_5=0 and 40<(x)<250}: " + sol.sumInRange(41, 249));
	}
}
