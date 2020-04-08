package aula01_Aula_20_programacao_Basica;

import java.util.Scanner;

public class Classe_Scanner {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//NextKine le qualquer tipo de dado
		
		System.out.print("Informe um nome: ");
		String nome = input.nextLine();
		
		System.out.print("Informe a sua altura: ");
		double altura = input.nextDouble();
		
		System.out.println("Tu tem pet?");
		boolean pet = input.hasNextBoolean();
		
		String temPet;
		if (pet==true) {
			temPet="sim";
		}
		
		else {
			temPet="nao";
		}
		
		
		System.out.println("\n\nO nome informado foi "+nome+ " e a altura "+String.format("%.2f", altura)
		+" e tu tem pet? "+temPet);
		
		
		
		input.close();

	}

}
