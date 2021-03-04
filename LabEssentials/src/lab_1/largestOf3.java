package lab_1;

import java.util.Scanner;

/**
 * @author divyu
 *
 */

public class largestOf3 {

	/**
	 * @param args
	 */
	
	public static int largestOfTrio(int num1, int num2, int num3) { // Returns the largest of three integers.
		return (num1 > num2) ?((num1 > num3) ?num1 :num3) :((num2 > num3) ?num2 :num3);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, num3; 
		
		Scanner input = new Scanner(System.in);
		System.out.println("Drop 3 integers >> "); //Input prompt.
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		input.close();
		
		System.out.println("Largest of the trio -> "+largestOfTrio(num1, num2, num3));
	}	

}
