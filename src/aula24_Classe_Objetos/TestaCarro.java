package aula24_Classe_Objetos;

public class TestaCarro {
	public static void main(String [] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Toro";
		van.numPassageiros = 7;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		Carro palio = new Carro();
		palio.marca = "Fiat";
		palio.modelo = "Palio";
		palio.numPassageiros=5;
		palio.capCombustivel=50;
		palio.consumoCombustivel=0.15;
		
		System.out.println("\n");
		System.out.println(palio.marca);
		System.out.println(palio.modelo);
			
		
		
		
	}

}
