package aula27_exercicios;

import java.util.Scanner;

public class ExercicioAluno {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Aluno aluno = new Aluno();

		// instancias o vetor de String e a matriz com as provas e Notas
		aluno.nomeDisciplinas = new String[2];
		aluno.notasDisciplinas = new double[2][3];

		System.out.println("Informe o nome do aluno:");
		aluno.nome = input.nextLine();

		System.out.println("Informe o nome do curso:");
		aluno.nomeCurso = input.nextLine();

		System.out.println("Informe a matricula");
		aluno.matricula = input.nextLine();

		for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
			System.out.println("Informe o nome das disciplinas #" + i);
			aluno.nomeDisciplinas[i] = input.next();

		}

		for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
			System.out.println("Informe as nota da disciplina " + aluno.nomeDisciplinas[i]);
			for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
				System.out.println("Informe a nota da prova #" + (j + 1));
				aluno.notasDisciplinas[i][j] = input.nextDouble();
			}

		}

		System.out.println("\n");

		aluno.mostrarInformacoes();

		for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
			if (aluno.VerificarAprovacao(i) == true) {
				System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " foi APROVADO");
			} else {
				System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " foi REPROVADO");
			}
		}

		for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {

			System.out.println("Media em " + aluno.nomeDisciplinas[i] + String.format(" %.2f", aluno.calcularMedia(i)));

		}

		input.close();

	}

}
