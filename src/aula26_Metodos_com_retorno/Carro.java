package aula26_Metodos_com_retorno;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
double calcularAutonomia () {
	
		System.out.println("O metodo obter autonomia foi chamado");
		
		return capCombustivel * consumoCombustivel;
	}

double calcularCombustivel(double km) {
	// km / km/litro = litro	
	double qtdCombustivel = km/consumoCombustivel;
	return qtdCombustivel;
}
	
	

}
