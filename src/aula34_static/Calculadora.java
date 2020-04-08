package aula34_static;

public class Calculadora {

	//quando usa o static fica sendo chamada de CLASSE UTILITARIA
	
	public static int soma(int numero1, int numero2) {
		return numero1 + numero2;
	}

	public static int soma(int numero1, int numero2, int numero3) {
		return numero1 + numero2 + numero3;
	}

	public static double soma(double numero1, double numero2, double numero3) {
		return numero1 + numero2 + numero3;
	}

	public static double soma(double[] vetorDouble) {
		double total = 0.0;

		for (int i = 0; i < vetorDouble.length; i++) {
			total = total + vetorDouble[i];
		}

		return total;

	}

}
