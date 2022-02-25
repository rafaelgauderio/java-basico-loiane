package aula67_threads_start_run_sleep;

public class Program {

	public static void main(String[] args) {
		
		
		System.out.println("Multitarefas, existem 2 tipos: Processos e Thead\n"
				+ "1.Processo � um programa sendo executado. Dentro de um processo pode haver v�rias threads(tarefas ao mesmo tempo.\n"
				+ "2.Thread � a menor unidade de c�digo que pode ser executada.\n"
				+ "\t2.1. Threads deixam os programas mais eficientes.\n"
				+ "\t2.2. Cinco estados: New, Runnable, Waiting, Running, Dead\n"
				+ "\t2.3. Ciclo de vida, m�todos: start(), run(), yield(),notify(), notifyAll(), resume(), sleep(), wait(), suspend()\n"
				+ "\t2.4. Duas maneiras de criar Threads: Extendendo a classe Thread ou Implementando a interface Runnable.\n");
		
		
		
		MyThread thread3 = new MyThread("Thread #fast",100);
		MyThread thread1 = new MyThread("Thread #1",400);
		//thread1.start(); vai dar erro de compita��o, pois o m�todo star est� dentro do construtor		
		MyThread thread2 = new MyThread("Thread #slow",1300);
		
		
	}

}
