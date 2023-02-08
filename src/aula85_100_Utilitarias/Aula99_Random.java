package aula85_100_Utilitarias;

import java.util.Random;

public class Aula99_Random {

	public static void main(String[] args) {
	
		System.out.println("\n� poss�vel gerar n�meros aleat�rios de 2 maneiras.\n"
				+ "\tPelo m�todo random da class Math.\n"
				+ "\tInstanciando uma objeto do tipo Random.\n");
		
		// gerando n�meros inteiros entre 1 e 10
		System.out.println(Math.floor(Math.random()* 10));
		
		// gerando n�meros quais entre 0 e 100 com 2 casas decimais
		System.out.println(String.format("%.2f",(Math.random() * 100)));
		
		Random randon = new Random();
		
		System.out.println(randon.nextBoolean());
		System.out.println(randon.nextLong());
		System.out.println(randon.nextDouble()*100);
		
		// n�o � inclusivo no ultimo limite superior, ent�o soma 1 para gerar n�meros entre 0 e 20 
		System.out.println(randon.nextInt(20+1));
		
		

	}

}
