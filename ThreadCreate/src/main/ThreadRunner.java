package main;

public class ThreadRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 = new MyRunnable("Nahid");
		Thread t1 = new Thread(r1);
		Runnable r2 = new MyRunnable("Hasan");
		Thread t2 = new Thread(r2);
		Runnable r3 = new MyRunnable("Raju");
		Thread t3 = new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
