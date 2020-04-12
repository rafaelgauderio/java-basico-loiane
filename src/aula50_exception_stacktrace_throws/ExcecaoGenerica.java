package aula50_exception_stacktrace_throws;

public class ExcecaoGenerica {

	public static void main(String[] args) {
		int[] numerador = { 8, 4, 16, 8, 32, 64, 128, 256 };
		int[] denominador = { 2, 2, 0, 4, 8, 0, 2 };

		for (int i = 0; i < numerador.length; i++) {
			try {
				System.out.println("Operação #" + (i + 1) + " =" + numerador[i] + "/" + denominador[i] + "="
						+ (numerador[i] / denominador[i]));
				System.out.println();

			}

			catch (Exception erro) {
				System.out.println("Operação #"+(i+1));
				System.out.println(erro.getMessage());
				erro.printStackTrace();
				System.out.println();

			}
		}

	}

}
