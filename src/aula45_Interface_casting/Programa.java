package aula45_Interface_casting;

public class Programa {

	public static void main(String[] args) {

		/*
		 * upcasting = converter um classe em uma superclasse; downcasting = inverso
		 * 
		 * alguns downcasting tem restrições, vao falhar apenas em tempo de compilacao
		 */

		Aluno aluno = new Aluno();
		Pessoa pessoaAluno = aluno; // upcasting = jogando variavel aluno para dentro de uma tipo Pessoa

		Pessoa aluno2 = (Pessoa) new Aluno();

		Pessoa aluno3 = new Pessoa();

		// Vai dar erro na compilaçao, um aluno nao pode virar um tipo pessoa,
		// tem atributos que tem em pessoa e nao existe em aluno
		// Aluno aluno4 = (Aluno) aluno3;

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Rafael De Luca");
		
		Aluno alunoNovo = new Aluno();
		alunoNovo.setNome("Aluno Roberley");
		
		Professor professor = new Professor();
		professor.setNome("Professor Claudio");

		if (pessoa instanceof Pessoa) {
			System.out.println(pessoa.getNome() + " é do tipo pessoa!");
		}

		if (alunoNovo instanceof Aluno) {
			System.out.println(alunoNovo.getNome() + " é do tipo aluno!");

		}
		
		if (professor instanceof Professor) {
			System.out.println(professor.getNome()+ " é do tipo Professor!");
		}
		

	}

}
