package aula72_notify_wait;

public class Clock {

	boolean tic;

	public synchronized void tic(boolean isRunning) {

		if(isRunning==false) {

			tic=true;
			notify();
			return;

		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		

		System.out.println("TIC ");
		tic=true;
		notify();

		try {
			while(tic==true) {
				wait();
			} 
		} catch (InterruptedException error) {
			error.printStackTrace();

		}

	}
	
	public synchronized void tack(boolean isRunning) {

		if(isRunning==false) {

			tic=false;
			notify();
			return;

		}
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("TACK");
		tic=false;
		notify();

		try {
			while(tic==false) {
				wait();
			} 
		} catch (InterruptedException error) {
			error.printStackTrace();

		}

	}

}
