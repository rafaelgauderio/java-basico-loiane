package aula74_thread_deadlock;

public class ProgramSemaphoro {

	public static void main(String[] args) {
		
		ThreadSemaphore semaphore = new ThreadSemaphore();
		
		int counter=0;
		
		while(counter<=10) {
			System.out.println(semaphore.getCollor());
			semaphore.waitChangeCollor();
			
			counter++;
			
		}
		
		semaphore.switchOff();

	}

}
