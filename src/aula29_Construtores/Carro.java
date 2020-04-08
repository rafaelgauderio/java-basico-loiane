package aula29_Construtores;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	
	//por boas praticas sempre gerar um construtor vazio (sem parametros)
	//por padrao instanciar valores inicial dentro do construtor
	Carro ( ) {
		System.out.println("A classe carro foi instanciada.");
		numPassageiros = 5;
	}
	
	//pode ter varios construtores na classe, desde que sejam diferentes
	Carro (String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_) {
		marca= marca_;
		modelo=modelo_;
		numPassageiros=numPassageiros_;
		capCombustivel=capCombustivel_;
		consumoCombustivel=consumoCombustivel_;
		
	}
	
	//via de regra, nome de metodo comeca com VERBO = boas praticas
	
	void exibirAutonimia () {
		
		System.out.println("A autonomia do carro é " + String.format("%.2f", capCombustivel* consumoCombustivel) +" em Km.");		
		
	}
	
	
	
	
}
