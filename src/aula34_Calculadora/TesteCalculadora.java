package Aula34_Calculadora;

public class TesteCalculadora {

	public static void main(String[] args) {

		System.out.println("Soma");
		imprimir(Calculadora.somar(5, 10));

		System.out.println("Subtração");
		imprimir(Calculadora.subtrair(30, 15));

		System.out.println("Multiplicação");
		imprimir(Calculadora.dividir(5, 2));

		System.out.println("Potenciação");
		imprimir(Calculadora.potencia(2, 3));
		imprimir(Calculadora.potencia(5, 1));
		imprimir(Calculadora.potencia(5, 0));

		System.out.println("Fatorial");
		imprimir(Calculadora.fatorial(6));
		imprimir(Calculadora.fatorial(5));
		imprimir(Calculadora.fatorial(4));
		imprimir(Calculadora.fatorial(3));
		imprimir(Calculadora.fatorial(2));
		imprimir(Calculadora.fatorial(1));
		imprimir(Calculadora.fatorial(0));

		System.out.println("Fatorial Recursivo");
		imprimir(Calculadora.fatorialRecursivo(7));
		imprimir(Calculadora.fatorialRecursivo(5));
		imprimir(Calculadora.fatorialRecursivo(4));
		imprimir(Calculadora.fatorialRecursivo(3));
		imprimir(Calculadora.fatorialRecursivo(2));
		imprimir(Calculadora.fatorialRecursivo(1));
		imprimir(Calculadora.fatorialRecursivo(0));

	}

	public static void imprimir(double num) {
		System.out.println(num);
	}

}
