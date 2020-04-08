package aula30_this;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	// palabra this, diferencia o que e atributo do que e apenas paramentro da
	// classe sendo instanciada no construtor
	// this referencia metodos e atributos da propria classe

	// pode ter varios construtores na classe, desde que sejam diferentes
	// F3 sobe o atributo, eclipse leva para a declaracao do atributo
	Carro() {
		this("Fiat", "Palio");
	}

	Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;

	}

	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Construtor com 3 parametros");
	}

	Carro(String marca, String modelo) {
		this(marca,modelo, 7);
		System.out.println("Construtor com 2 parametros");

	}

	void exibirAutonimia() {

		System.out.println("A autonomia do carro é "
				+ String.format("%.2f", this.capCombustivel * this.consumoCombustivel) + " em Km.");

	}

	double obterAutonomia() {
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		return km/this.consumoCombustivel;
	}

}
