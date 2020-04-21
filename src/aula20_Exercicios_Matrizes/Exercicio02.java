package aula20_Exercicios_Matrizes;

import java.util.Random;

public class Exercicio02 {

	public static void main(String[] args) {

		int[][] matrizInteiros = new int[8][8];

		Random numeroAleatorio = new Random();

		// primeiro gerar a matriz de numero aleatórios, range de 0 - 100
		int range = 150;
		for (int i = 0; i < matrizInteiros.length; i++) {
			for (int j = 0; j < matrizInteiros[i].length; j++) {
				matrizInteiros[i][j] = numeroAleatorio.nextInt(range);
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

		int L5maior = 0;
		//range foi definido até 100
		int L5menor = 101;
		int linha5 = 5;

		// iterar as colunas da linha 5

		for (int j = 0; j < matrizInteiros[linha5].length; j++) {
			if (matrizInteiros[linha5][j] > L5maior) {
				L5maior = matrizInteiros[linha5][j];

			}
			if (matrizInteiros[linha5][j] < L5menor)
				L5menor = matrizInteiros[linha5][j];

		}

		System.out.println("\nO maior da linha 5 = " + L5maior);
		System.out.println("\nO menor da linha 5 = " + L5menor);

		// iterar as linhas da coluna 7

		int C7maior = Integer.MIN_VALUE;
		int C7menor = Integer.MAX_VALUE;
		int coluna7 = 7;
		
		for (int i = 0; i < matrizInteiros.length; i++) {
			if (matrizInteiros[i][coluna7] > C7maior) {
				C7maior = matrizInteiros[i][coluna7];

			}
			if (matrizInteiros[i][coluna7] < C7menor) {
				C7menor = matrizInteiros[i][coluna7];
			}

		}

		System.out.println("\nO maior da coluna 7 = " + C7maior);
		System.out.println("\nO menor da coluna 7 = " + C7menor);
	

	}

}
