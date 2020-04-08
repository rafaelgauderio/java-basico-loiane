package aula31_Public_Private;

//public - qualquer classe de outro pacote pode ver essa classe

//default - visivel apenas dentro do proprio pacote
//private - apenas classes dos mesmo pacote podem ver essa classe

public class Carro {

	public String marca;
	String modelo;
	int numPassageiros;
	private double capCombustivel;
	private double consumoCombustivel;

	public Carro() {

	}

	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
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

	public Carro(String marca, String modelo) {
		this(marca, modelo, 7);
		System.out.println("Construtor com 2 parametros");

	}
	
	//gerar os getters and setters para os private
	
	

	public double getCapCombustivel() {
		return capCombustivel;
	}

	public void setCapCombustivel(double capCombustivel) {
		this.capCombustivel = capCombustivel;
	}

	public double getConsumoCombustivel() {
		return consumoCombustivel;
	}

	public void setConsumoCombustivel(double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}

	public void exibirAutonimia() {

		System.out.println("A autonomia do carro é "
				+ String.format("%.2f", this.capCombustivel * this.consumoCombustivel) + " em Km.");

	}

	public double obterAutonomia() {
		return this.capCombustivel * this.consumoCombustivel;
	}

	private double dividirKmPorConsumo(double km) {
		return km / this.consumoCombustivel;
	}

	public double calcularCombustivel(double km) {
		return this.dividirKmPorConsumo(km);
	}
	
	

}
