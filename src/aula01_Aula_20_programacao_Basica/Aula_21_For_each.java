package aula01_Aula_20_programacao_Basica;

public class Aula_21_For_each {

	public static void main(String[] args) {
		//For each é um for melhorado, usado muito com arrays
		//Como se tivesse criando um variavel para receber o valor de detarminada posicao do array
		
		int [] notas = new int[10] ;
		
		notas[0]= 10;
		notas[1]= 8;
		notas[2]= 10;
		notas[3]= 4;
		notas[4]= 10;
		notas[5]= 10;
		notas[6]= 7;
		notas[7]= 3;
		notas[8]= 10;
		notas[9]= 1;
		
		int soma=0;
		
		for (int i=0; i<notas.length; i++) {
			soma =  soma +notas[i];			
		}
		
		double media = (double)soma/notas.length;
		
		
		
		for (int i=0 ; i<notas.length; i ++) {
			System.out.println("Sua nota na prova #"+(i+1)+" foi "+notas[i]);
		}
		System.out.println("\nSua media nas provas foi "+String.format("%.2f", media));
	}
	
	

}
