package aula01_Aula_20_programacao_Basica;

public class For_Each_Matriz {

	public static void main(String[] args) {
		double[][] notasAlunos = new double[3][5];

		notasAlunos[0][0] = 9.7;
		notasAlunos[0][1] = 8.7;
		notasAlunos[0][2] = 9.4;

		notasAlunos[1][0] = 4.7;
		notasAlunos[1][1] = 5.7;
		notasAlunos[1][2] = 6.4;

		notasAlunos[2][0] = 9.2;
		notasAlunos[2][1] = 5.7;
		notasAlunos[2][2] = 3.6;

		int i = 0;
		for (double[] apelido : notasAlunos) {

			System.out.println("Notas do aluno #" + (i + 1) + ":");

			for (double notas : apelido) {
				System.out.print("[" + notas + "]");
			}
			// Uma quera de linha para cada aluno
			System.out.println("\n");
			i++;

		}

	}

}
