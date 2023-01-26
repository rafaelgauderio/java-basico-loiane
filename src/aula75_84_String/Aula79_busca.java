package aula75_84_String;

import java.util.Arrays;

public class Aula79_busca {

	public static void main(String[] args) {
		
		String euller = "Euller";
		String alvogrado = new String ("Alvogrado");
		String grado = "grado";
		char [] alv= new char [] {'a','l','v'};
		
		System.out.println("IndexOf: retorna -1 se não encontra ou o index do caracter da String");
		System.out.println("LastIndexOf: retorna a última vez que o caracter aparece na String");
		System.out.println("Contains: ver se a string contém o caracter ou a string procurada");
		
		System.out.println("\nindexOf");
		System.out.println(euller.indexOf('e'));
		System.out.println(euller.indexOf('r'));
		System.out.println(euller.indexOf('y'));
		
		System.out.println("\nlastIndexOf");
		System.out.println(euller.lastIndexOf('e'));
		System.out.println(alvogrado.lastIndexOf('a'));
		System.out.println(alvogrado.lastIndexOf('o'));
		
		System.out.println("\ncontains");
		System.out.println(euller.contains("eu"));
		System.out.println(euller.contentEquals(grado));
		System.out.println(alvogrado.contains(grado));
		System.out.println(alvogrado.contains(Arrays.toString(alv)));		
		System.out.println(Arrays.toString(alv));
		

	}

}
