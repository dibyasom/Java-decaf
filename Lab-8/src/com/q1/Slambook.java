package com.q1;

import java.util.*;

public class Slambook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] slambook = new Student[10];
		
		// Utility
		Random guess = new Random();
		
		// Initialize array variables.
		for(Integer i=0; i<10; i++) {
			slambook[i] = new Student("Dibya" + (char)(guess.nextInt(91 - 65 + 1)+65), guess.nextInt());
		}
		
		for(int i=0; i<20; i++) {
			
			try {
				System.out.println("Name: "+ slambook[i].name+ " | Roll No.: "+ slambook[i].roll);
			} catch (ArrayIndexOutOfBoundsException e){
				System.out.println("Loop index > Array length. Err: " + e);
				System.out.println("Breaking loop :)"); break;
			}
		}
		
		System.out.println("I'm from post-error section of code, hehe.");
	}

}
