package aula49_exceptions_finally;

public class FinallyPegadinha {

	public static void main(String[] args) {

		int[] numerador = { 8, 4, 16, 8, 32, 64, 128, 256 };
		int[] denominador = { 2, 2, 0, 4, 8, 0, 2 };

		for (int i = 0; i < numerador.length; i++) {
			try {
				System.out.println("Opera��o #" + (i + 1) + " =" + numerador[i] + "/" + denominador[i] + "="
						+ (numerador[i] / denominador[i]));
				

			}
			
			catch (ArithmeticException erro1) {
				System.out.println("Erro, na opera��o #" + (i + 1) + " ocorreu uma divis�o por zero!");
				System.exit(0);

			}

			catch (ArrayIndexOutOfBoundsException erro2) {
				System.out.println("Erro, na opera��o #" + (i + 1) + " ocorreu uma posi��o inv�lida do vetor!");
				System.exit(0);
			}
			
			//N�o vai entrar no bloco finally devido ao comando System.exit(0)
			finally {
				System.out.println("Imprime essa frase ap�s cada bloco try ou catch!");
				System.out.println();
			}

		}

	}

}
