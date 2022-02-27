package aula71_threads_synchronized;

public class ArithmeticProgression {
	
	private int sum;
	
	//tem que colocar o syncronized para as threads não acessarem a região crítica ao mesmo tempo
	public synchronized int SumProgression(int [] array) {
		
		sum=0;
		
		for(int i=0; i<array.length; i++) {
			sum= sum + array[i];
			
			System.out.println("Executing sun..." + Thread.currentThread().getName() + " sum the value "
					+ array[i] + " with the total " + sum);
			
				
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
			
		}
		
		
		return sum; 
		
	}

}
