package aula68_threads_Interface_Runnable;

import aula67_threads_start_run_sleep.MyThread;

public class Program01 {
	
	public static void main(String [] args) {
		
		MyThreadRunnable thread1 = new MyThreadRunnable("Thread #fast",200);
		MyThreadRunnable thread2 = new MyThreadRunnable("Thread #medium",700);				
		MyThreadRunnable thread3 = new MyThreadRunnable("Thread #slow",1300);
		
	}

}
