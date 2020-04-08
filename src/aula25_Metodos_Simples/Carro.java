package aula25_Metodos_Simples;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	//via de regra, nome de metodo comeca com VERBO = boas praticas
	
	void exibirAutonimia () {
		
		System.out.println("A autonomia do carro é " + capCombustivel* consumoCombustivel +" em Km.");		
		
	}
	
	
	
	
}
