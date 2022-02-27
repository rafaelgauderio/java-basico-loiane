package aula74_thread_deadlock;

public class ThreadSemaphore implements Runnable{


	private SemaphoreCollor collor;
	private boolean stop;
	private boolean collorHadChanged;

	public ThreadSemaphore() {

		//semáforo começa fechado (vermelho)
		this.collor=SemaphoreCollor.RED;
		this.stop=false;
		this.collorHadChanged=false;
		new Thread(this).start();
	}



	public SemaphoreCollor getCollor() {
		return collor;
	}



	@Override
	public void run() {
		while(stop==false) {

			/*

			try {

		}
			switch(this.collor) {	
		case RED:
			Thread.sleep(5000);
			break;
		case GREEN:
			Thread.sleep(2000);
			break;

		case YELLOW:
			Thread.sleep(500);
			break;

		default:
			break;

		}
			 */



			try {
				Thread.sleep(this.collor.getWatingTime());
				this.changeColor();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}


		}

	}

	private synchronized void changeColor() {
		switch (this.collor) {

		case RED:
			this.collor=SemaphoreCollor.GREEN;
			break;
		case GREEN:
			this.collor=SemaphoreCollor.YELLOW;
			break;

		case YELLOW:
			this.collor=SemaphoreCollor.RED;
			break;

		default:
			break;

		}
		this.collorHadChanged=true;
		notify();

	}
	public synchronized void waitChangeCollor() {
		while(this.collorHadChanged==false) {
			try {
				wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		this.collorHadChanged=false;
	}


	public synchronized void switchOff() {
		this.stop=true;
		System.out.println("Semaphoro is SWITCH OFF");

	}




}
