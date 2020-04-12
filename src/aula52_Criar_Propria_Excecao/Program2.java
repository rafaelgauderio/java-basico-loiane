package aula52_Criar_Propria_Excecao;

public class Program2 {

	public static void main(String[] args) {

		try {
			teste();
		} catch (ExcecaoDivisaoNaoExata e) {
			e.printStackTrace();
		}
	}

	public static void teste() throws ExcecaoDivisaoNaoExata {
		int[] numeros = { 4, 8, 5, 16, 32, 21, 64, 128 };
		int[] demon = { 2, 0, 4, 8, 0, 2, 4 };

		for (int i = 0; i < numeros.length; i++) {
			try {
				if (numeros[i] % 2 != 0) {
					// lan�ar a exception aqui
					throw new ExcecaoDivisaoNaoExata(numeros[i], demon[i]);
				}
				System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i] / demon[i]));
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Aconteceu um erro");
				e.printStackTrace();
			}
		}
	}

}
