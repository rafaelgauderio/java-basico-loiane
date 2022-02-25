package aula66_Garbage_Collector;
import javax.sql.rowset.serial.SQLOutputImpl;

import aula61_passagem_parametros.Person;

public class GarbageCollector {
	
	public final static void getUseMemory() {
		
		final long MEGABYTES = 1024 * 1024;
		Runtime runtime = Runtime.getRuntime(); // padr�o singleton
		System.out.println("Max Memory: " + runtime.maxMemory()/MEGABYTES + " Megabytes");
		long usedMemory = (runtime.totalMemory() - runtime.freeMemory())/MEGABYTES;
		System.out.println("Used Memory: " + usedMemory + " Megabytes");		
		
		
		
	}
	
	public static void main(String [] vector) {
		
		
		System.out.println("Garbage Colletor\n"
				+ "Limpar a mem�ria Heap para deixar mais mem�rias dispon�vel\n"
				+ "1. Objetos s�o marcados para serem limpos da mem�ria\n"
				+ "2. Objetivos s�o removidos da mem�ria\n"
				+ "3. Mem�ria � otimizada (desfragmentada).\n");
		
		
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
		Runtime.getRuntime().gc(); // chamando o garbage coletor para limpar a mem�ria.
		
		System.out.println("\nUsers removed from memory\n");
		
		getUseMemory();
		
		
		
		
	}

}
