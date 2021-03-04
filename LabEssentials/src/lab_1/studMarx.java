package lab_1;

import java.util.Scanner;

public class studMarx {
	
	static class quicksort{
		
		// FixPivot element in correct position, Quick-sort utility.
				private int fixPivot(Float[] arr, int l, int r) {
					float pivot = arr[l++]; 
					int ind = l-1, i = l;
					
					for(; i<=r; i++) {
						if(arr[i] <= pivot) {
							float temp = arr[i];
							arr[i] = arr[++ind];
							arr[ind] = temp;
						}
					}
					Float temp = arr[l-1];
					arr[l-1] = arr[ind];
					arr[ind] = temp;
					
					return ind;
				}
				
		public void sort(Float[] arr, int l, int r) {
			if(l>r)
				return;
			else {
				int pivotAt = fixPivot(arr, l, r);
				sort(arr, l, pivotAt-1);
				sort(arr, pivotAt+1, r);
			}
		}

	}
	
	public static void summarizeMarks(Float arr[]) {
		System.out.println("\nSummarizing Results...\nMarks Secured\tGrade Awarded");
		for(Float mark: arr) {
			String grade;
			if(mark < 40) {				
				grade = "FAIL";
			} else if(mark <= 50) {				
				grade = "PASS";
			} else if(mark <= 75) {			
				grade = "MERIT";
			} else {				
				grade = "DISTINCTION";
			}
			
			System.out.println(mark +"\t\t"+ grade);
		}
	}
	
	public static void main(String[] args) {
		
		// Array for storing marks.
		Float[] studentMarks = new Float[10];
		
		// Fetching input from stream;
		Scanner input = new Scanner(System.in);
		System.out.println("Hello there<3\nDrop marks of 10-students plis,");
		for(int i=0; i<studentMarks.length; i++)
			studentMarks[i] = input.nextFloat();
		input.close();
		
		// Sorting the array.
		quicksort studentMarx = new quicksort();
		System.out.println("Quicksorting <3...");
		studentMarx.sort(studentMarks, 0, studentMarks.length-1);
		summarizeMarks(studentMarks);
	}
}
