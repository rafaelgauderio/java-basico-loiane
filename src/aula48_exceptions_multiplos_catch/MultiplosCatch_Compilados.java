package aula48_exceptions_multiplos_catch;

public class MultiplosCatch_Compilados {

	public static void main(String[] args) {

		int[] numerador = { 8, 4, 16, 8, 32, 64, 128, 256 };
		int[] denominador = { 2, 2, 0, 4, 8, 0, 2 };

		for (int i = 0; i < numerador.length; i++) {
			try {
				System.out.println("Operação #" + (i + 1) + " =" + numerador[i] + "/" + denominador[i] + "="
						+ (numerador[i] / denominador[i]));
				System.out.println();

			}

			// A partir do java 7, é possivel concaternar as exceções via PIPE
			catch (ArithmeticException | ArrayIndexOutOfBoundsException erros) {
				System.out.println("Ocorreu um erro na operação #" + (i + 1));
				System.out.println();
			}

		}
	}

}
