package aula43_Classe_Object;

public class Programa {

	public static void main (String[] args) {

		Aluno aluno = new Aluno();

		aluno.setCurso("Engenharia Aeroespacial");
		double[] notas = { 10, 7, 9, 4, 6 };
		aluno.setNotas(notas);

		System.out.println(aluno);

		Aluno aluno2 = new Aluno();
		aluno2.setCurso("Engenharia Aeroespacial");
		double[] notas2 = { 10, 7, 9, 4, 6 };
		aluno2.setNotas(notas2);

		System.out.println(aluno2);

		Aluno aluno3 = new Aluno();
		aluno3.setCurso("Engenharia Aeroespacial");
		// alterado umas das notas
		double[] notas3 = { 8, 7, 9, 4, 5 };
		aluno3.setNotas(notas3);

		System.out.println(aluno3);

		String s1 = "Rafael De Luca";
		String s2 = "RAFAEL DE LUCA";

		// compara enderecos de memoria e nao conteudo
		System.out.println(s1 == s2);
		// compara os conteudos
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));

		System.out.println("\n");

		System.out.println(aluno == aluno2);
		System.out.println(aluno.equals(aluno2));
		System.out.println(aluno.equals(aluno3));

	}

}
