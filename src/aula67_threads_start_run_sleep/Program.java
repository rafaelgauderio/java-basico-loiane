package aula67_threads_start_run_sleep;

public class Program {

	public static void main(String[] args) {
		
		MyThread thread3 = new MyThread("Thread #fast",100);
		MyThread thread1 = new MyThread("Thread #1",400);
		//thread1.start(); vai dar erro de compitação, pois o método star está dentro do construtor		
		MyThread thread2 = new MyThread("Thread #slow",1500);
		
		
	}

}
