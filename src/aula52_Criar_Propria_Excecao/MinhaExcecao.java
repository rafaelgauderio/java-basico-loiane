package aula52_Criar_Propria_Excecao;

public class MinhaExcecao {

	public static void main(String[] args) {

		int[] numerador = { 8, 4, 5, 16, 8, 32, 64, 128, 256, 125,10,8 };
		int[] denominador = { 2, 2, 3, 0, 4, 8, 0, 2, 4 };

		for (int i = 0; i < numerador.length; i++) {
			try {
				if (numerador[i] % 2 != 0) {

					throw new Exception("Numerador não é um número par");

				}
				System.out.println("Operação #" + (i + 1) + " =" + numerador[i] + "/" + denominador[i] + "="
						+ (numerador[i] / denominador[i]));
				System.out.println();

			}

			catch (ArithmeticException | ArrayIndexOutOfBoundsException erros) {
				System.out.println("Ocorreu um erro na operação #" + (i + 1));	
				System.out.println(erros.getMessage());				
				System.out.println();
			}

			catch (Exception erro) {
				System.out.println("Ocorreu um erro na operação #" + (i + 1));
				System.out.println(erro.getMessage());				
				System.out.println();
			}

		}
	}
}
