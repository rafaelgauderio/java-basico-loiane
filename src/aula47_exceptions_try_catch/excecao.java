package aula47_exceptions_try_catch;

public class excecao {

	public static void main(String[] args) {
		
		try {
			double[] vetor = new double[5];

			System.out.println("Antes de gerar a exceção!");

			vetor[4] = 3.14;
			System.out.println(vetor[4]);
			System.out.println("Esse texto será impresso");

			vetor[6] = 6.25;
			System.out.println(vetor[6]);
			System.out.println("Esse texto NÃO será impresso");
		}
		
		catch (ArrayIndexOutOfBoundsException erro) {
			System.out.println("Índice do vetor inexistente! ");
			
			
		}
		
		System.out.println("\nEsse texto será impresso após executar o bloco catch");
		

	}

}
