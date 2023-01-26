package aula75_84_String;

public class Aula75_construtores {

	public static void main(String[] args) {
		
		System.out.println("String são arrays de caracteres.\n"
				+ "String são imutáveis. Uma vez criadas não podem ser alteradas.");
		
		String empty = new String ();
		System.out.println("\nString vazia" + empty);
		
		String completeName = new String ("Rafael de Luca");
		System.out.println("\nNome: " + completeName);
		
		//esse ponteiro vai apontar para o endereço da variável completeName
		String name2 = new String(completeName);
		System.out.println("\nNome via ponteiro: " + name2);
		
		// string como um array de caracteres
		char [] arrayName = {'R','a','f','a','e','l'};
		String name3 = new String(arrayName);
		System.out.println("\n" + name3);
		
		char [] arrayLastName = {'D','e',' ', 'L','u','c','a'};
		String lastName = new String(arrayLastName,0,7);
		System.out.println("\nSobrenome: " + lastName);
		
		// usando tabela ascii
		byte [] arrayNickName = {82, 97, 102, 97};
		String nickName = new String (arrayNickName);
		System.out.println("\nApelido: " + nickName);
		
		System.out.println("Variáveis abaixo vão compartilhar o mesmo endereço de memória,/n"
				+ "visto que têm o mesmo conteúdo");
		
		String course = "Java programming course";
		String java = "Java programming course";
		
		System.out.println("\n"+course);
		System.out.println(java);	
		

	}

}
