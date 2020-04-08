package aula33_Sobrecarga;

public class Calculadora {

	// sobrecarga = overload de metodos
	// tem que mudar alguma coisa, nao pode ter dois metodos iguais, tem que mudar
	// o tipo do parametro ou a quantidade de parametros
	// E possivel tambem a sobrecarga de construtores

	public int soma(int numero1, int numero2) {
		return numero1 + numero2;
	}

	public int soma(int numero1, int numero2, int numero3) {
		return numero1 + numero2 + numero3;
	}

	public double soma(double numero1, double numero2, double numero3) {
		return numero1 + numero2 + numero3;
	}

	public double soma(double[] vetorDouble) {
		double total = 0.0;

		for (int i = 0; i < vetorDouble.length; i++) {
			total = total + vetorDouble[i];
		}

		return total;

	}

}
