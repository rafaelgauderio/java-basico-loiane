package aula29_Construtores;

public class TestaCarro {
	public static void main(String[] args) {

		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Toro";
		//van.numPassageiros = 7;
		van.capCombustivel = 100;
		van.consumoCombustivel = 8.2;

		System.out.println(van.marca);
		System.out.println(van.modelo);
		//ja foi setado o valor inicial la no construtor
		System.out.println(van.numPassageiros);
		
		van.exibirAutonimia();
		
		System.out.println("\n");
		
		Carro novoCarro = new Carro();
		System.out.println(novoCarro.numPassageiros);
		
		Carro novaVan = new Carro("Wolks","Fusca",4,50,13.4);
		
		System.out.println(novaVan.marca);
		System.out.println(novaVan.modelo);
		System.out.println(novaVan.numPassageiros);
		System.out.println(novaVan.capCombustivel);
		System.out.println(novaVan.consumoCombustivel);
		
		
		
		
	}

}
