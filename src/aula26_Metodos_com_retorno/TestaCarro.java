package aula26_Metodos_com_retorno;

import java.util.Scanner;

public class TestaCarro {
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Toro";
		van.numPassageiros = 7;
		van.capCombustivel = 100;
		van.consumoCombustivel = 10;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		Carro palio = new Carro();
		palio.marca = "Fiat";
		palio.modelo = "Palio";
		palio.numPassageiros=5;
		palio.capCombustivel=50;
		palio.consumoCombustivel=12;
		
		System.out.println("\n");
		System.out.println(palio.marca);
		System.out.println(palio.modelo);
		
		double autonomia;
		autonomia = palio.calcularAutonomia();
		
		System.out.println("A autonomia do palio = "+String.format("%.2f", autonomia));
		System.out.println("A autonomia da van = "+van.calcularAutonomia());
			
		System.out.print("Informe quantos quilometros tu quer fazer:");
		double km = input.nextDouble();
		System.out.println("Para percorrer " +km+" quilometros com o palio, tu vai ter que abastecer "+String.format("%.2f", palio.calcularCombustivel(km))+" litros." );
		
		
	}

}
