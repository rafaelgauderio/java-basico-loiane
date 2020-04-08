package aula37_Heranca;

public class Program {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		Professor professor = new Professor();

		Pessoa pessoa = new Pessoa();

		aluno.setNome("Rafael");
		aluno.setTelefoneCelular("994569476");
		
		System.out.println(aluno.getTelefoneCelular());

	}

}
