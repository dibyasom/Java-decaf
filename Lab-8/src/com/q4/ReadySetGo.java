package com.q4;

import java.util.*;

public class ReadySetGo extends Thread {
	
	Integer velA, velB;
	
	ReadySetGo(Integer velA, Integer velB){
		this.velA = velA;
		this.velB = velB;
	}
	
	public char go() throws CollisionAwareException {
		if ((long)this.velA*this.velB < 0)
			throw new CollisionAwareException("Cancelling mission in interest of saving lives, cus collision expected!");
		else
			return ((new Random().nextInt(2 - 1)-1) == 1 ?'A' : 'B');
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("A> ====================================== <B\n"
				+ "Racetrack Rendered!\nCAUTION | Use -ve sign to denote pod's motion of direction :)\nSpace-Pod-A and Pod-B velocity > ");
		Scanner input = new Scanner(System.in);
		ReadySetGo gameOn = new ReadySetGo(input.nextInt(), input.nextInt());
		input.close();
		
		try {
			System.out.println("Race finished, Space-Pod-"+ gameOn.go() + " won!");
		} catch (CollisionAwareException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Race cancelled!");
	}

}
