package aula33_Sobrecarga;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora ();
		
		
		System.out.println(calc.soma(1,4));
		System.out.println(calc.soma(1,7,6));
		System.out.println(calc.soma(2.3,4.5,6.3));
		
		double [] vetor = {3.4,4.5,3,8,15,4,4.3,4.6};
		
		System.out.println(calc.soma(vetor));
		
		

	}

}
