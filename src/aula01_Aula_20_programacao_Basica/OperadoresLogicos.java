package aula01_Aula_20_programacao_Basica;

public class OperadoresLogicos {

	public static void main(String[] args) {
		/*
		 * & and E
		 * | or  OU
		 * ^ XOR OU...OU Falso quando os 2 tem valores igual
		 * 
		 * || or  CURTO CIRCUITO
		 * && and CURTO CIRCUITO
		 * ! not
		 * * 
		 */
		int valor1 = 5;
		int valor2 = 10;
		
		//and - Precisa que tudo seja verdadeiro			
		boolean result1 = (valor1==90) && (valor2==10); 
		System.out.println(result1);
		
		//or - Precisa apenas um ser verdadeiro		
		boolean result2 = (valor1==90) || (valor2==10); 
		System.out.println(result2);
		
		boolean verdadeiro = true;
		boolean falso = false;
		
		System.out.println("\n\n");
		System.out.println(verdadeiro && falso);
		System.out.println(verdadeiro || falso);
		System.out.println(verdadeiro ^ falso);
		System.out.println(!verdadeiro && falso);
		System.out.println(!verdadeiro || falso);
		
		
		
		
		
		
		
		
		

	}

}
