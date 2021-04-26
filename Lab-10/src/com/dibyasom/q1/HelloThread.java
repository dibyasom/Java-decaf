package com.dibyasom.q1;

import java.util.*;

public class HelloThread {
	
	class Multithreaded implements Runnable{
		
		public void task() {
			System.out.println(Thread.currentThread().getName() + " >> Engaged!");
			for(int i=0; i<5; i++) {
				System.out.println("*");
				try {
					Thread.currentThread();
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			task();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloThread parenThread = new HelloThread();
		
		List<Thread> threads = new ArrayList<Thread>();
		Integer T = 5;
		for (int i = 0; i < T; i++) {
			threads.add(new Thread(parenThread.new Multithreaded()));
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
