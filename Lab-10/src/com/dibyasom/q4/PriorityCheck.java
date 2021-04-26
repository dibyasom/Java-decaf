package com.dibyasom.q4;

import java.util.*;

public class PriorityCheck {

	class Multithreaded implements Runnable {

		public void task() {
			System.out.println("\n"+Thread.currentThread().getName() + " >> Engaged!");
			for (int i = 0; i < 5; i++) {
				System.out.print("*");
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
		PriorityCheck parenThread = new PriorityCheck();

		List<Thread> T = new ArrayList<Thread>();
		Integer threadCount = 5;
		for (int i = 0; i < threadCount; i++) {
			T.add(new Thread(parenThread.new Multithreaded()));
			T.get(i).start();
			if (i < 2) {
//				Setting 2-threads to highest priority, and putting 'em to sleep.
				T.get(i).setPriority(Thread.MAX_PRIORITY);
				System.out.println(T.get(i).getName() + " set to HIGHEST_PRIORITY");
				try {
					T.get(i);
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
//			Highest priority thread fell asleep.
		}

		ArrayList<String> aliveStack = new ArrayList<String>();
//		Check which threads lasts longer.
		while (T.get(0).isAlive() || T.get(1).isAlive() || T.get(2).isAlive() || T.get(3).isAlive()
				|| T.get(4).isAlive()) {
			for (int i = 0; i < threadCount; i++) {
				if (T.get(i).isAlive())
					aliveStack.add(T.get(i).getName());
			}
		}
		
		System.out.println("\n/****************************/\nLast thread which went-dark > "+aliveStack.get(aliveStack.size()-1));
	}

}
