package aula75_84_String;

public class Aula80_modificando_string {

	public static void main(String[] args) {
		
		String firstName = "Rafael";
		String space = " ";
		String lastName = "de Luca";
		String silva = new String ("da Silva");
		String completeName = firstName + space + lastName;
		String linus = "        L i n u s P a u l i n g                     ";
		
		System.out.println("Método substring é para extrair pedaçoes de uma string, mas sem recortar a string. Informa o index de incio e fim");
		System.out.println("Índice de inicio é inclusivo e índice fim é exclusivo");
		System.out.println("recplace é para substituir caracteres");
		System.out.println("trim é pra remover os espaços no inicio e fim\n");
		
		System.out.println(firstName.concat(space).concat(lastName));
		
		System.out.println(firstName.substring(0,4));
		System.out.println(lastName.substring(3));
		
		System.out.println(completeName.replaceAll(completeName.substring(7,14),silva));
		
		System.out.println(completeName.replaceAll("a","e"));
		
		System.out.println(linus.replaceAll(" ",""));
		System.out.println(linus.trim());
		
		
		
		
	}

}
