package com.dibyasom.q2;

import java.util.*;

public class NumbersForReal {

	class Multithreaded implements Runnable {
		
		boolean odd;
		Integer ceiling;
		
		Multithreaded(boolean odd, Integer ceiling){
			this.odd = odd;
			this.ceiling = ceiling;
		}
		
		public void task() {
			System.out.println(Thread.currentThread().getName() + " >> Engaged!");
			String T = Thread.currentThread().getName();
			for(int i=0; i<this.ceiling; i++) {
				if(i%2!=0 && this.odd) {
					System.out.println(T+ " >> "+i+", ");
				} else if(i%2==0 && !this.odd) {
					System.out.println(T+ " >> "+i+", ");
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
		
		NumbersForReal parent = new NumbersForReal();
		
		List<Thread> T = new ArrayList<Thread>();
		T.add(new Thread(parent.new Multithreaded(true, 10)));
		T.add(new Thread(parent.new Multithreaded(false, 10)));
		
		T.get(0).start();
		T.get(1).start();
		
		for(int i=0; i<2; i++) {
			try {
				T.get(i).join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("\n/**/\n"+Thread.currentThread().getName()+ " going dark :3");
	}

}
