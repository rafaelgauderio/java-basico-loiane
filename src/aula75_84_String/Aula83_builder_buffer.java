package aula75_84_String;

import java.util.Arrays;

public class Aula83_builder_buffer {

	public static void main(String[] args) {		
		
		System.out.println("StringBuffer economiza memória com relação a ficar concatendo várias Strings.\n"
				+ "StringBuffer é thread safe.");
		
		System.out.println("StringBuilder tem o mesmo funcionamento do StringBuffer");		
		System.out.println("Concatenando String perde muita memória e pode deixar a API lenta\n");
		
		
		String [] letters = {"E","q","u","a","ç","õ","e","s"," ","d","e"," ","M","a","x","w","e","l","l"};
		String maxwell = "";
		
		for (String apelido : letters) {
			maxwell += apelido;
		}
		
		System.out.println(maxwell);
		
		StringBuilder string01 = new StringBuilder();
		for(String apelido : letters) {
			string01.append(apelido);
		}
		
		System.out.println(string01.toString());
		
		
		StringBuffer string02 = new StringBuffer();
		for(String apelido : letters) {
			string02.append(apelido);
		}
		
		System.out.println(string02.toString());
		
			
			

	}

}
