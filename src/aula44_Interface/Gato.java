package aula44_Interface;

public class Gato extends Mamifero implements AnimalDomesticado, AnimalEstimacao{

	private String raca;
	
	public String getRaca() {
		return raca;
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	@Override
	public void brincar() {
		
		System.out.println("O gato "+getNome() + "da raca " +getRaca()+ " vai sair pra brincar");
	}

	@Override
	public void levarPassear() {
		System.out.println("O gatinho está saindo para passear");
		
	}

	@Override
	public void levarAoVeterinario() {
		System.out.println("O gato está doente e vai ao veterinário!");
		
	}

	@Override
	public void Alimentar() {
		System.out.println("O gato está indo se alimentar!");
		
	}

	@Override
	public void amamentar() {
		System.out.println("Gato é um mamífero o vai amamentar.");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("O gato faz MIAU");
		
	}

}
