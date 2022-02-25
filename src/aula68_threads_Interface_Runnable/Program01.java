package aula68_threads_Interface_Runnable;

import aula67_threads_start_run_sleep.MyThread;

public class Program01 {
	
	public static void main(String [] args) {
		
		MyThreadRunnable thread1 = new MyThreadRunnable("Thread #fast",100);
		Thread t1 = new Thread(thread1);
		t1.start();			
	
		
	}

}
