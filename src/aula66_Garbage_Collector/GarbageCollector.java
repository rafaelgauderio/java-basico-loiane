package aula66_Garbage_Collector;
import javax.sql.rowset.serial.SQLOutputImpl;

import aula61_passagem_parametros.Person;

public class GarbageCollector {
	
	public final static void getUseMemory() {
		
		final long MEGABYTES = 1024 * 1024;
		Runtime runtime = Runtime.getRuntime(); // padrão singleton
		System.out.println("Max Memory: " + runtime.maxMemory()/MEGABYTES + " Megabytes");
		long usedMemory = (runtime.totalMemory() - runtime.freeMemory())/MEGABYTES;
		System.out.println("Used Memory: " + usedMemory + " Megabytes");		
		
		
		
	}
	
	public static void main(String [] vector) {
		
		
		System.out.println("Garbage Colletor\n"
				+ "Limpar a memória Heap para deixar mais memórias disponível\n"
				+ "1. Objetos são marcados para serem limpos da memória\n"
				+ "2. Objetivos são removidos da memória\n"
				+ "3. Memória é otimizada (desfragmentada).\n");
		
		
		Person [] users = new Person[9999999];
		
		Person person;
		int counter=0;
		while (counter < users.length) {
			person = new Person("Person"+counter, "51-3383838383", "person@gmail.com");
			users[counter]=person;
			counter++;
		}	
		
		System.out.println("Created users");
		getUseMemory();
		users = null;
		
		Runtime.getRuntime().runFinalization(); //
		Runtime.getRuntime().gc(); // chamando o garbage coletor para limpar a memória.
		
		System.out.println("\nUsers removed from memory\n");
		
		getUseMemory();
		
		
		
		
	}

}
