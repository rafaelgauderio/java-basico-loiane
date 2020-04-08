package aula41_classes_abstratas;


public class Teste {

	public static void main(String[] args) {
		//nao vai ter como instanciar a classe pessoa
		//Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();

		//pessoa.setEndereco("Rua Brasil, num 35");
		aluno.setEndereco("Av. Cristovao, num 87");
		professor.setEndereco("Rua Jacinto, num 45");
		
		System.out.println(aluno.getEndereco());
		System.out.println(professor.getEndereco());
		
		System.out.println("\n");
		
		aluno.imprimirEtiquetaEndereco();
		professor.imprimirEtiquetaEndereco();

	}

}
