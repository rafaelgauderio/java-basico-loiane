package aula61_passagem_parametros;

public class Program01 {

	public static void main(String[] args) {
		
		
		System.out.println("Tipos primitivos: passagem por valor.");
		System.out.println("Tipos classe, enum, array: passagem por referências. Similar a ponteiros em Linguagem C ou C++.\n");

		Person person = new Person("Rafael de Luca", "51-33457970","deluca@gmail.com");
		int value = 17;
		
		System.out.println("Original values");
		System.out.println(person);
		System.out.println(value);
		
		System.out.println("Pass by reference");
		//valores serão os mesmos
		passByreference(value, person);
		System.out.println(person);
		System.out.println(value);
		
		System.out.println("Pass by reference");
		System.out.println("Tem que mudar as referências da memória Heap para alterar.");
		//Agora altera os valores dos passados por referência. Passagem por valor não altera
		passByreference2(value, person);
		System.out.println(person);
		System.out.println(value);	
		
		
		
	}
	
	public static void passByreference(int value, Person person) {
		
		int newValue = value +13;
		value = newValue;
		person = new Person("New Name","51-35999090","newemail@gmail.com");
		
	}
	
	public static void passByreference2(int value, Person person) {
		
		int newValue = value + 13;
		value= newValue;
		person.setName("New Name");
		person.setPhone("51-new phone number");
		person.setEmail("newemail@gmail.com");
		
	}

}
