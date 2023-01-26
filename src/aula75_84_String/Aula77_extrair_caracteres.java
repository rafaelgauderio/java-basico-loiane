package aula75_84_String;

import java.util.Arrays;

public class Aula77_extrair_caracteres {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		String name = new String ("Rafael de Luca");
		
		
		for (int i=0 ;  i< name.length() ; i++) {
			System.out.print(name.charAt(i));
		}		
		
		System.out.println("\n");
		char [] arrayNickName = new char[4];
		name.getChars(0,4,arrayNickName,0);
		System.out.println(arrayNickName);
		
		// O método mais usado é o charAt
		System.out.println();
		char [] arrayNickName2 = new char[4];
		for(int i=0, j=0; i < arrayNickName.length ; i++, j++) {
			arrayNickName2[j] = name.charAt(i);
		}		
		System.out.println(arrayNickName2);
		
		System.out.println("\nConvertendo uma atring para um vetor de Caracteres");
		char [] arrayChar = name.toCharArray();
		System.out.println(arrayChar);
		
		// char de bytes
		// o parametro que informa o fim do array não é inclusivo do caracter
		byte [] nameBytes = new byte [4];
		name.getBytes(0,4, nameBytes, 0);
		System.out.println("\n" + Arrays.toString(nameBytes));		

	}

}
