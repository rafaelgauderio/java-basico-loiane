package aula71_threads_synchronized;

public class ThreadSum implements Runnable {
	
	private String name;
	private int [] numbers;
	private static ArithmeticProgression arithmetic;
	
	public ThreadSum(String name, int [] numbers) {
		
		arithmetic = new ArithmeticProgression();
		this.name = name;
		this.numbers=numbers;
		//new Thread(this,name).start();
		Thread thread = new Thread(this,name);
		thread.start();
		
	}
	
	
	

	@Override
	public void run() {
		
		System.out.println(this.name + " ...inicialized");
		int sum = arithmetic.SumProgression(this.numbers);
		System.out.println("Sum result " + this.name + " is " + sum);
		System.out.println(this.name + " finished!\n");
		
		
	}

}
