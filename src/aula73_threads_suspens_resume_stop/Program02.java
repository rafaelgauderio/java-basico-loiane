package aula73_threads_suspens_resume_stop;


public class Program02 {

	public static void main(String[] args) {

		MinhaThread t1 = new MinhaThread("#1");
		MinhaThread t2 = new MinhaThread("#2");
		
		t1.suspend();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t2.suspend();
		t1.resume();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t2.resume();
		t1.stop();
		t2.stop();
	}

}


