package aula27_exercicios;

public class Aluno {

	String nome;
	String matricula;
	String nomeCurso;
	String[] nomeDisciplinas;
	double[][] notasDisciplinas;

	void mostrarInformacoes() {
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome do curso: " + nomeCurso);

		for (int i = 0; i < notasDisciplinas.length; i++) {
			System.out.println("Nota da disciplina " + nomeDisciplinas[i]);
			for (int j = 0; j < notasDisciplinas[i].length; j++) {
				System.out.print(notasDisciplinas[i][j] + " ");
			}
			System.out.println();

		}
	}

	boolean VerificarAprovacao(int codigoDisciplina) {

		if (calcularMedia(codigoDisciplina) >= 6.0) {

			return true;
		}

		return false;

	}

	double calcularMedia(int codigoDisciplina) {

		double soma = 0;
		for (int i = 0; i < notasDisciplinas[codigoDisciplina].length; i++) {
			soma += notasDisciplinas[codigoDisciplina][i];

		}

		double media = soma / 3;

		return media;
	}

}
