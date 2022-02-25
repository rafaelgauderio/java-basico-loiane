package aula68_threads_Interface_Runnable;

public class MyThreadRunnable  implements Runnable{

	private String name;
	private int time;

	public MyThreadRunnable(String name, int time) {
		this.name =  name;
		this.time = time;

	}


	public void run () {
		System.out.println("Executing thread... " + this.name);
		try {
			int counter=0;
			while(counter<10) {
				System.out.println(name  + " counter " + (counter+1));
				Thread.sleep(time); 
				counter++;
			}
		} catch (InterruptedException error) {
			error.printStackTrace();
		}

		System.out.println(this.name + " dead");


	}






}
