package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadRunner {

	private static final int MAX_THREADS = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Runnable r1 = new MyRunnable("Nahid");
		
		//Runnable r2 = new MyRunnable("Hasan");
		
		//Runnable r3 = new MyRunnable("Raju");
		/*
		r1.run();
		r2.run();
		r3.run();
		*/
		Thread t = new Thread(new MyRunnable());
		t.start();
		t.interrupt();
		/*
		Runnable r1 = new MyRunnable("Hello");
		Runnable r2 = new MyRunnable("Goodbye");
		ExecutorService pool = Executors.newFixedThreadPool(MAX_THREADS);
		pool.execute(r1);
		pool.execute(r2);
		*/
		/*
		ExtendsThread t = new ExtendsThread("Nahid Hasan Raju");
		t.start();
		*/
		/*
		Thread t3 = new Thread(r3);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		t3.start();
		*/
	}

}
