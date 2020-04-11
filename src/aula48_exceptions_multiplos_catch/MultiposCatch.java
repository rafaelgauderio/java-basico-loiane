package aula48_exceptions_multiplos_catch;

public class MultiposCatch {

	public static void main(String[] args) {

		int[] numerador = { 8, 4, 16, 8, 32, 64, 128, 256 };
		int[] denominador = { 2, 2, 0, 4, 8, 0, 2 };

		for (int i = 0; i < numerador.length; i++) {
			try {
				System.out.println("Operação #" + (i + 1) + " =" + numerador[i] + "/" + denominador[i] + "="
						+ (numerador[i] / denominador[i]));
				System.out.println();

			}

			catch (ArithmeticException erro1) {
				System.out.println("Erro, na operação #" + (i + 1) + " ocorreu uma divisão por zero!");
				System.out.println();

			}

			catch (ArrayIndexOutOfBoundsException erro2) {
				System.out.println("Erro, na operação #" + (i + 1) + " ocorreu uma posição inválida do vetor!");
				System.out.println();
			}

		}

	}

}
