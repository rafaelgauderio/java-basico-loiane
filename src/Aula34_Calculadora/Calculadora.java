package Aula34_Calculadora;

public class Calculadora {

	public static double somar(double num1, double num2) {
		return num1 + num2;

	}

	public static double subtrair(double num1, double num2) {
		return num1 - num2;
	}

	public static double multiplicar(double num1, double num2) {
		return num1 * num2;
	}

	public static double dividir(double num1, double num2) {
		return num1 / num2;
	}

	public static double potencia(double num1, double num2) {
		double result = 1;
		for (int i = 1; i <= num2; i++) {
			result = result * num1;
		}
		return result;
	}

	public static int fatorial(int num) {
		if (num==0 || num==1) {
			return 1;
		}
		else {
			int result =num;
			for(int i=(num-1); i>1 ; i--) {
				result *=i;
			}
			return result;
		}
	}	

	public static int fatorialRecursivo(int num) {
		if (num == 0 || num == 1) {
			return 1;
		}
		return num * fatorialRecursivo(num - 1);

	}

}
