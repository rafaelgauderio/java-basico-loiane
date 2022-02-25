package aula67_threads_start_run_sleep;

public class MyThread extends Thread {
	
	private String name;
	private int time;
	
	public MyThread(String name, int time) {
		this.name =  name;
		this.time = time;
		start();
	}
	
	//Triangulo a esquerda indica que o método está sendo sobrescrito
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
