package aula49_exceptions_finally;

public class Finally {

	public static void main(String[] args) {

		int[] numerador = { 8, 4, 16, 8, 32, 64, 128, 256 };
		int[] denominador = { 2, 2, 0, 4, 8, 0, 2 };

		for (int i = 0; i < numerador.length; i++) {
			try {
				System.out.println("Operação #" + (i + 1) + " =" + numerador[i] + "/" + denominador[i] + "="
						+ (numerador[i] / denominador[i]));

			}

			catch (ArithmeticException erro1) {
				System.out.println("Erro, na operação #" + (i + 1) + " ocorreu uma divisão por zero!");

			}

			catch (ArrayIndexOutOfBoundsException erro2) {
				System.out.println("Erro, na operação #" + (i + 1) + " ocorreu uma posição inválida do vetor!");

			}

			// QUASE sempre executado
			finally {
				System.out.println("Imprime essa frase após cada bloco try ou catch!");
				System.out.println();
			}

		}

	}

}
