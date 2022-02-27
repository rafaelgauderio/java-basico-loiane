package aula72_notify_wait;


public class ThreadClock implements Runnable {
	
	private Clock clock;
	private Thread thread;
	public final int NUMBER=10;
	
	public ThreadClock(String name, Clock clock) {
		this.clock=clock;
		thread = new Thread(this,name);
		thread.start();
	}		
	


	public Clock getClock() {
		return clock;
	}




	public void setClock(Clock clock) {
		this.clock = clock;
	}




	public Thread getThread() {
		return thread;
	}




	public void setThread(Thread thread) {
		this.thread = thread;
	}




	@Override
	public void run() {
		if(thread.getName().equalsIgnoreCase("TIC")) {
			
			for(int i=0; i<NUMBER; i++) {
				clock.tic(true);
				
			}
			clock.tic(false);
			
		} else {
			for(int i=0; i<NUMBER; i++) {
				clock.tack(true);
				
			}
			clock.tack(false);
			System.out.println("TRIIIIIIIMMMMMMMMMMMMMM.WAKE UP!");		
			
		}
		
	
		
	}

}
