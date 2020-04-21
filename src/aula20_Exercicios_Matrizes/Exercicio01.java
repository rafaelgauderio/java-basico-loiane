package aula20_Exercicios_Matrizes;

import java.util.Random;

public class Exercicio01 {

	public static void main(String[] args) {

		int[][] matrizInteiros = new int[4][4];

		Random numeroAleatorio = new Random();

		for (int i = 0; i < matrizInteiros.length; i++) {
			{
				for (int j = 0; j < matrizInteiros.length; j++) {
					System.out.print("[" + (i + j) + "]\t");

				}
				System.out.print("\n");
			}
		}

		System.out.println("\n");

		// primeiro gerar a matriz de némeros aleatórios, range de 0 - 100

		for (int i = 0; i < matrizInteiros.length; i++) {
			for (int j = 0; j < matrizInteiros[i].length; j++) {
				matrizInteiros[i][j] = numeroAleatorio.nextInt(250);
			}

		}

		System.out.println("Matriz de números aleatórios\n");

		for (int i = 0; i < matrizInteiros.length; i++) {
			{
				for (int j = 0; j < matrizInteiros[i].length; j++) {
					System.out.print("[" + matrizInteiros[i][j] + "]\t");
				}
				System.out.print("\n");
			}
		}

		int limiteInferior = 0;
		int LimiteSuperior = 251;
		int linha = 0;
		int coluna = 0;

		for (int i = 0; i < matrizInteiros.length; i++) {
			for (int j = 0; j < matrizInteiros[i].length; j++) {
				if (matrizInteiros[i][j] > limiteInferior) {
					limiteInferior = matrizInteiros[i][j];
					linha = i+1;
					coluna = j+1;
				}

			}
		}

		System.out.println("\nO maior número é " + limiteInferior + " e está na posicao linha, coluna #" + linha + coluna);

		for (int i = 0; i < matrizInteiros.length; i++) {
			for (int j = 0; j < matrizInteiros[i].length; j++) {
				if (matrizInteiros[i][j] < LimiteSuperior) {
					LimiteSuperior = matrizInteiros[i][j];
					linha = i+1;
					coluna = j+1;
				}

			}
		}

		System.out.println("\nO menor número é " + LimiteSuperior + " e está na posicao linha, coluna #" + linha + coluna);

	}

}
