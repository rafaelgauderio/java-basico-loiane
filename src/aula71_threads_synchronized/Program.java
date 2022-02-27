package aula71_threads_synchronized;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Synchronized é a ação de coordenar as atividades entre threads que concorrerem\n"
				+ "\tpara acessar um recurso compartilhado.\n"
				+ "Somente uma thread deve acessar esse recurso por vez");
		
		//pa de razão 3
		int [] pa = {1,4,7,10,13,16};
		ThreadSum t1 = new ThreadSum("Thread 1", pa);
		ThreadSum t2 = new ThreadSum("Thread 2", pa);
		ThreadSum t3 = new ThreadSum("Thread 3", pa);
	
		
		

	}

}
