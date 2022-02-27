package aula74_thread_deadlock;

public enum SemaphoreCollor {
	
	GREEN(1500), YELLOW(400), RED(3000);
	
	private int watingTime;
	
	SemaphoreCollor(int watingTime) {
		
		this.watingTime=watingTime;
		
	}
	
	public int getWatingTime() {
		return this.watingTime;
	}

}
