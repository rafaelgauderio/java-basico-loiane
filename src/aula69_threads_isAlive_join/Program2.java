package aula69_threads_isAlive_join;


public class Program2 {

	public static void main(String[] args) {
		
		MyThreadRunnable thread1 = new MyThreadRunnable("Thread #fast",300);
		MyThreadRunnable thread2 = new MyThreadRunnable("Thread #medium",800);				
		MyThreadRunnable thread3 = new MyThreadRunnable("Thread #slow",1200);
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		
		t1.start();
		t2.start();
		t3.start();
		
		//join() espera a termino da execucação da thread para continuar o código
			try {
				t1.join();
				t2.join();
				t3.join();				
				
			} catch (InterruptedException error) {
				
				error.printStackTrace();
			}
		
		
		System.out.println("Program Finished!".toUpperCase());

	}

}
