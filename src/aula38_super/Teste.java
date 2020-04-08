package aula38_super;

public class Teste {

	public static void main(String[] args) {
		double[] vetor = { 2.4, 4.5 };

		Aluno alunoNovo = new Aluno("Rafael", "Rua da Patria", "33509862", "001.150.203-89", "98097645", "Matematica",
				vetor);
		
		System.out.println(alunoNovo+"\n\n");
		
		
		Professor professorNovo = new Professor("Juliana Silva", "Av. Da Patria, 35", 
				"33597864", "009.067.560-81", "98765473", 2500, "Quimica Organica");
		
		System.out.println(professorNovo);

	}

}
