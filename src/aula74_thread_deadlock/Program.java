package aula74_thread_deadlock;

public class Program {

	public static void main(String[] args) {
		System.out.println("Deadlock: quando um recurso que uma thread ou programa quer usar e o recurso está bloquado.\n"
				+ "Senão liberar o recurso fica deadlock, ou seja, a thread fica esperando eternamente.\n");



		final Object RESOURCE1 = "Natura resourcers 01";
		final Object RESOURCE2 = "Artificial resourcers 02";

		Thread thread1 = new Thread() {
			public void run(){
				synchronized (RESOURCE1) {
					System.out.println("Thread #1: block resource 1");

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					System.out.println("Thread #1: trying to access the resource 2");

					synchronized (RESOURCE2) {
						System.out.println("Thread #1: block resource 2");
					}
				}
			}
		};

		Thread thread2 = new Thread() {
			public void run(){
				synchronized (RESOURCE2) {
					System.out.println("Thread #2: block resource 2");

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					System.out.println("Thread #2: trying to access resource 1");

					synchronized (RESOURCE1) {
						System.out.println("Thread #2: block resource 1");
					}
				}
			}
		};
		
		thread1.start();
		thread2.start();


	}

}
