package com.r177219075.q3;

import java.util.*;

public class whichMonth {
	static class solution{
		
//		Secret calendar
		private static String[] months = {
				"January", "February", "March", "April",
				"May", "June", "July", "August",
				"September", "October", "November", "December"
		};
		
		public static String toMonth(int m) {
			return solution.months[m-1];
		}
	}
	
	public static void main(String[] args) {
		
		//Fetch input month.
		Scanner input = new Scanner(System.in);
		Integer monthNo = input.nextInt();
		input.close();
		
		//Display month.
		System.out.println("Month Index: " + monthNo);
		System.out.println("It's " + solution.toMonth(monthNo)+ " (Of Course <3)");
	}
}
