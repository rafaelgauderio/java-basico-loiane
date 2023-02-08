package aula85_100_Utilitarias;

import org.apache.commons.*;
import org.apache.commons.lang3.StringUtils;



public class Aula100_jars {

	public static void main(String[] args) {
		
		System.out.println("jars é um empacotamento de uma bliblioteca do Java.");
		
		String nome = StringUtils.abbreviate("Rafael de Luca",9);
		System.out.println(nome);
		
		System.out.println(StringUtils.capitalize("primeira maisucla"));
		System.out.println(StringUtils.deleteWhitespace("Rafael     de Luca        "));

	}

}
