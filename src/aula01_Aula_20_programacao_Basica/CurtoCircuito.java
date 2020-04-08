package aula01_Aula_20_programacao_Basica;

public class CurtoCircuito {

	public static void main(String[] args) {
		
		boolean verdadeiro = true;
		boolean falso = false;
		boolean result1 = falso & verdadeiro;
		
		/*
		 * no curto curcuito ele nem analisa a a segundo condicao, como a primeira sendo falsa
		 * a operaco logica vai ser falsa, mais usado no dia a dia para econimziar processamento
		 */
		 
		boolean result2 = falso && verdadeiro;
		
		System.out.println(result1);
		System.out.println(result2);
		
		//precedencia
		int result3 = 1+1-1*1/1;
		System.out.println(result3);
		
		
		
		

	}

}
