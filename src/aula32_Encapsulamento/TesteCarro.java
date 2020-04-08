package aula32_Encapsulamento;

public class TesteCarro {

	public static void main(String[] args) {
		// Encapsulamento = Nao expor diretamente os atributos para manipulacao
		
		Carro carro = new Carro();
		
		carro.setMarca("Ford");
		carro.setModelo("Escort");
		
		System.out.println("Marca: "+carro.getMarca()+", Modelo: "+carro.getModelo());

	}

}
