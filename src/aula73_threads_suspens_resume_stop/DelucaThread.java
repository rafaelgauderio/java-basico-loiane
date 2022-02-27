package aula73_threads_suspens_resume_stop;

public class DelucaThread implements Runnable{

	private String name;
	private String lastName;
	private boolean isSuspend;
	private boolean wasFinished;




	public DelucaThread(String name, String lastName) {		
		this.name = name;
		this.lastName = lastName;
		new Thread(this,name).start();
	}




	@Override
	public void run() {

		System.out.println("Executing... " + this.name);

		try {
			for (int i=0; i<15; i++){
				System.out.println("Thread " + this.name + " " + this.lastName + ", " + i);
				Thread.sleep(200);
				synchronized (this) {
					while (isSuspend==true){
						wait();
					}
					if (this.wasFinished==true){
						break;
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Thread " + this.name + " was finished.");


	}
	
	void suspend( ) {
		this.isSuspend=true;
	}

	synchronized void resume() {
		this.isSuspend=false;
		//this.wasFinished=false;
		notify();
	}
	
	synchronized void stop() {
		
		this.wasFinished=true;
		notify();
	}

}
