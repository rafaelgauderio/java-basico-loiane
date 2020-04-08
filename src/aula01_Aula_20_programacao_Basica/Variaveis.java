package aula01_Aula_20_programacao_Basica;

public class Variaveis {

	public static void main(String[] args) {
		//se estourar o limite dos inteiros, faz como se fosse um roleta, volta para o menor numero
		
		int limiteSuperior = 2147483647;
		int limiteInferior = -2147483648;
		
		int x=2;
		
		//nao vai dar errro, vai voltar pro inicio e somar mais 1;
		
		System.out.println("Limite Inferior do tipo inteiro + 1 = "+(limiteSuperior+x)); 
		System.out.println(limiteInferior==-2147483648);
	}

}