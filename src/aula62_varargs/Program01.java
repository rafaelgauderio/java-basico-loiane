package aula62_varargs;

public class Program01 {

	public static void main(String[] args) {
		System.out.println("Varagrs: Recurso que permite passar infinitos parâmetros para um método, sem declarar todos esses parâmetros.");
			System.out.println(potency(3, 4));
			int [] vector = {1,6,3,4,2,15,90};
			System.out.println(sum(vector));
			
			System.out.println("Using Vargs");
			System.out.println(sum(500,10,20,20));
			
			

	}
	
	public static int potency(int a, int b) {
		
		return (int) Math.pow(a, b);		
		
	}
	
	public static int sum(int [] vector) {
		int sum = 0;
		for(int i=1; i<vector.length ; i++) {
			sum +=vector[i];
		}
		return sum;
		
	}
	//utilizando vários parâmetros do tipo integer
	//vargs sempre como último parametro do método
	public static int sum(int initial, Integer...vargs) {
		int sum = 0;
		for(int i=0; i<vargs.length ; i++) {
			sum +=vargs[i];
		}
		return initial + sum;
		
	}
	
	

}
