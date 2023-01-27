package aula75_84_String;

import java.util.StringTokenizer;

public class Aula84_tokenizer {

	public static void main(String[] args) {
		
		System.out.println("Classe StringTotenizer é usada para extrair informações de Strings grandes ou arquivos.\n"
				+ "Extrair tokens das Strings que está sendo lida as informações");

		String file ="code: 2145,name: Rafael de Luca,weight: 75.90 kg,age: 35 years";
		
		StringTokenizer stringtoken = new StringTokenizer(file,",");
		
		do {
			System.out.println(stringtoken.nextToken());
		} while (stringtoken.hasMoreElements());		

	}

}
