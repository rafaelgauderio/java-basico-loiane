package aula01_Aula_20_programacao_Basica;

import java.util.Random;

public class For_Each_Randomico {

	public static void main(String[] args) {

		double[] notas = new double[15];

		Random randomico = new Random();

		for (int i = 0; i < notas.length; i++) {
			// limite do valor das notas no argumento da funcao
			notas[i] = randomico.nextInt(10);
		}

		for (int i = 0; i < notas.length; i++) {
			System.out.println(String.format("%.2f", notas[i]));
		}

		System.out.println("\nUsando o for Each");

		// usar no apelido a variavel no singular == boas praticas
		for (double nota : notas) {
			System.out.println(nota);
		}

		// o que acontece internamente no for Each

		System.out.println("\n");

		for (int i = 0; i < notas.length; i++) {
			double nota = (notas[i]);
			System.out.println(nota);

		}

	}

}
