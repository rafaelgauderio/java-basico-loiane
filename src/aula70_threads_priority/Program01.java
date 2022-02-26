package aula70_threads_priority;

import aula69_threads_isAlive_join.MyThreadRunnable;

public class Program01 {

	public static void main(String[] args) {
		
		System.out.println("Prioridades variam de 1 a 10. Sendo 10 a maior prioridade\n"
				+ "Também é possível usar os valroes de constantes para as prioridades\n");
		
		
		MyThreadRunnable thread1 = new MyThreadRunnable("Thread #fast",400);
		MyThreadRunnable thread2 = new MyThreadRunnable("Thread #medium",400);				
		MyThreadRunnable thread3 = new MyThreadRunnable("Thread #slow",400);
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		
		//t1.setPriority(10);
		t1.setPriority(Thread.MAX_PRIORITY);
		//t2.setPriority(5);
		t2.setPriority(Thread.NORM_PRIORITY);
		//t3.setPriority(1);
		t3.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		
		

	}

}

