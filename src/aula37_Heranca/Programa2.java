package aula37_Heranca;

public class Programa2 {

	public static void main(String[] args) {
		
		//acesso apenas as informacoes que sao comuns para a classe Pessoa
		
		Pessoa aluno = new Aluno();		
		aluno.setNome("Carol");
		System.out.println(aluno.getNome());
		
		Pessoa professor = new Professor();
		professor.setCpf("0010289345921");
		System.out.println(professor.getCpf());
		
		//nao usar um extenderem uma classe cachorro
		//cachorro nao e uma pessoa, apesar de ter nome, endereco e um telefone na coleira
		
	}

}
