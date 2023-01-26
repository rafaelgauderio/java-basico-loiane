package aula75_84_String;

public class Aula78_Comparacao {

	public static void main(String[] args) {
		
		String maxwell = "Maxwell";
		String maxwell2 = "MAXWELL";
		String maxwell3 = "Maxwell";
		String maxwell4 = new String (maxwell);
		
		System.out.println("maxwell equals maxwell2 = " + maxwell.equals(maxwell2)); // false
		System.out.println("maxwell equals maxwell3 = " + maxwell.equals(maxwell3)); // true
		System.out.println("maxwell equalsIgnoreCase maxwell2 = " + maxwell.equalsIgnoreCase(maxwell2)); // true
		
	
		System.out.println("\nExiste um poll no java ondem são guardadas as strings que tem o mesmo valor atribuido,\n"
				+ "ou seja, compartilham o mesmo endereço de memória.\n"
				+ "Operador == compara referência de memória\n");
		
		System.out.println("maxwell == maxwell2 = " + (maxwell == maxwell2)); // false
		System.out.println("maxwell == maxwell3 = " + (maxwell == maxwell3)); // false // tem o mesmo conteudo apontam para o mesmo valor de memória
		System.out.println("maxwell2 == maxwell3 = " + (maxwell2 == maxwell3)); // true
		System.out.println("maxwell == maxwell4 = " + (maxwell == maxwell4)); // false // apostam para endereço de memoria diferente
		System.out.println("maxwell equals maxwell4 = " + (maxwell.equals(maxwell4))); // true // apostam para endereço de memoria diferente, mas tem o mesmo valor
		System.out.println("maxwell equalsIgnorareCase maxwell4 = " + (maxwell.equalsIgnoreCase(maxwell4))); // true // apostam para endereço de memoria diferente, mas tem o mesmo valor
		
		System.out.println("\nVer se um string tem alguma parte de uma região de uma string menor. Análogo ao like do sql");
		String euller = new String ("Euller");
		String eu = "eu";
		String ll = "ll";
		String ler = "ler";
		
		System.out.println(euller.regionMatches(0,eu,0,2)); // false
		System.out.println(euller.regionMatches(true,0,eu,0,2)); // true // primeiro parametro é o equalIgnoraCase
		System.out.println(euller.regionMatches(2,ll,0,2)); // true
		System.out.println(euller.endsWith(ler)); //true
		System.out.println(euller.startsWith(eu)); // false // devido ao ignora case
		System.out.println(euller.startsWith("Eu")); //true
		
		System.out.println("\nMétodo compareTo (usado para fazer ordenação\n"
				+ "-1 se o primeiro objeto é maior\n"
				+ "0 se tem o mesmo tamanho\n"
				+ ">=1 se o segundo objeto é maior\n");
		
		System.out.println(euller.compareTo(ler));
		System.out.println(eu.compareTo(ll)); // apesar de eu ter a mesma quantidade de caracteres que ll, na tabela ASCCI eu tem um valor menor que ll
		System.out.println(ll.compareToIgnoreCase(euller));
		System.out.println(eu.compareTo("EU")); //maisculo vem antes na tabela ASCCI
		System.out.println(eu.compareToIgnoreCase("EU"));
		
		
		
		

	}

}
