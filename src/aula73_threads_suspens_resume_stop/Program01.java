package aula73_threads_suspens_resume_stop;

public class Program01 {

	public static void main(String[] args) {
		
		
		System.out.println("Métodos remuse, suspend e stop foram desconinuados\n"
				+ "Acontecia o probema de deadlook: quando uma thread quer acessar um recurso\n"
				+ "\tque está bloqueado por outra thread.\n");
		
		DelucaThread rafael = new DelucaThread("Thread#1","Rafael De Luca");
		DelucaThread claudia = new DelucaThread("Thread#2","Claudia De Luca");
		
		
		
		System.out.println("Pausing Thread #1");		
		rafael.suspend();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Pausing Thread #2");		
		claudia.suspend();				
		
		System.out.println("Resuming Thread #1");		
		rafael.resume();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Resuming Thread #2");
		claudia.resume();
		
		
		System.out.println("Finishing Thread #1");
		rafael.stop();
		System.out.println("Finishing Thread #2");
		claudia.stop();
		

		
		
		
		

	}

}
