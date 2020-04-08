package aula35_recursividade;

public class TesteFibonacciSomatorio {

	public static void main(String[] args) {
		
		for (int num=0 ; num<25 ; num++) {
			System.out.print(Fibonacci.fibonacci(num)+" ");
		}
		
		System.out.println("\n\n");
		
		for (int num=1 ; num<20 ; num++) {
			System.out.print(Somatorio.somatorio(num)+ " ");
		}

	}

}
