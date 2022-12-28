package com.lambdaexpression;

class ThreadDemo implements Runnable {

	@Override
	public void run() {
		System.out.println("implimention of runnable");
	}
	
}

public class RunnableLambda {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new ThreadDemo());
		
		thread.start();
		
		
		Runnable runnable = ()->System.out.println("runnble calling..");
		
		Thread t1= new Thread(runnable);
		
		t1.start();
		

	}

}
