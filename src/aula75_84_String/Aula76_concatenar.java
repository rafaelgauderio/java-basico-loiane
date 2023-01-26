package aula75_84_String;

public class Aula76_concatenar {

	public static void main(String[] args) {

		String lineBreak = "\n";
		String firstName = "Rafael";
		String space = " ";
		String lastName = "de Luca";
		String compleName = lineBreak + firstName + space + lastName;
		System.out.println(compleName);

		System.out.println("\nConcatenate");
		String sum = "Result of operation 17 + 10 = " + (17 + 10);
		String string1710 = "Result of concatenation 17 + 10 = " + 17 + 10;
		System.out.println(sum);
		System.out.println(string1710);

		;

		String loren = "\nLorem ipsum dolor sit amet. Qui repudiandae molestias sit omnis eaque qui magnam nesciunt et pariatur repellendus. Eum blanditiis ratione At quasi asperiores aut dolor recusandae eos optio eveniet.\n"
				+ "Et ratione quasi ut dolorem dolor et corporis maxime est obcaecati delectus et voluptatem adipisci ex quidem quae. Ad tempora molestias qui consequatur nemo sed nihil dicta et sint quae nam culpa natus aut dicta unde.\n"
				+ "Ab cupiditate aliquid nam aliquam necessitatibus et optio sint."
				+ "erferendis ratione est similique dolorum ut necessitatibus iure qui enim fugit est unde commodi "
				+ "et quas reprehenderit sed saepe velit. Aut repudiandae temporibus rem nesciunt neque eos voluptate neque id dicta placeat et quia vitae ut suscipit voluptatum. Ut nulla commodi qui obcaecati quia 33 quam impedit sed .\n";

		System.out.println(loren);

		System.out.println("\nNão é um boa prática ficar contanenado várias strings em um linguição de strings\n"
				+ "Isso gera leak de memória e pode deixar a aplicação lenta");

		String concatenate = "\nLorem ipsum dolor sit amet. Qui repudiandae molestias sit omnis eaque\n";
		concatenate += "\tSit velit quas id voluptatem doloremque ut neque illum ut ullam laudantium. Est molestias accusamus ut inventore consequatur aut perferendis fuga\n";
		concatenate += "\tqui amet ratione sed facilis velit in amet labore qui quidem minus aut deserunt tenetur.\n";
		concatenate += "\taperiam omnis aut ipsam facere qui dolorum possimus sit harum quas ut velit eaque. Vel galisum quaerat a exercitationem suscipit aut iste totam.\n";
		concatenate += "Fim da encheção de linquiça.";
		System.out.println(concatenate);
	}

}
