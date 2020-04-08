package aula40_Polimorfismo;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa() ;
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		pessoa.setEndereco("Rua Brasil, num 35");
		aluno.setEndereco("Av. Cristovao, num 87");
		professor.setEndereco("Rua Jacinto, num 45");
		
		//Polimorfismo -> 
		//Classe Aluno e Professor nao tem o metodo obeterEtiquetaEndereco(), mas
		//consegue acesssar ele pela heranca
		System.out.println(pessoa.obterEtiquetaEndereco());
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());
		
		
				
				

	}

}
