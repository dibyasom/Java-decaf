package com.dibyasom.q3;

import java.util.*;

public class ThreadedIncrementor {
	
	static class Multithreaded implements Runnable{
		
		static Integer counter;
		
//		Default Constructor
		Multithreaded(){
			counter = 0;
		}
		
		public synchronized void task() {
			try {
				Thread.currentThread().sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " logged :)");
			counter++;
			System.out.println(" | Counter-val: "+ counter+ " |");
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			task();
		}
		
	}
	
//	Driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Thread> threads = new ArrayList<Thread>();
		Integer T = 5;
		for (int i = 0; i < T; i++) {
			threads.add(new Thread(new Multithreaded()));
			threads.get(i).start();
		}
		
		for(int i=0; i< T; i++) {
			try {
				threads.get(i).join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
