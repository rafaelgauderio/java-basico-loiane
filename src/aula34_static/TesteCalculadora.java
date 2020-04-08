package aula34_static;

public class TesteCalculadora {

	static int resultSoma;
	
	static int multiplica(int numero1, int numero2) {
		return numero1*numero2;
	}

	public static void main(String[] args) {

		// se colocar o static nao precisa mais instanciar

		// Calculadora calc = new Calculadora ();

		System.out.println(Calculadora.soma(1, 4));
		System.out.println(Calculadora.soma(1, 7, 6));
		System.out.println(Calculadora.soma(2.3, 4.5, 6.3));

		double[] vetor = { 3.4, 4.5, 32, 8, 15.8, 4, 4.3, 4.6, 0.9 };

		System.out.println(Calculadora.soma(vetor));

		resultSoma = Calculadora.soma(15, 16);
		System.out.println(resultSoma);
		
		int multiplicacao = multiplica(5, 7);
		System.out.println(multiplicacao);

	}

}
