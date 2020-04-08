package aula44_Interface;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao {

	/*
	 * NAO existe heranca multiplica no java. Classe somente da pra extender 1 vez,
	 * interface pode ser implementadas infinitas vezes. *
	 */

	private int tamanho;
	private String raca;

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public void brincar() {
		System.out.println("Este cachorro de nome " +getNome()+  " está brincando!");

	}

	@Override
	public void levarPassear() {
		System.out.println("Animalzinho saindo para passear!");

	}

	@Override
	public void levarAoVeterinario() {
		System.out.println("Animal está doente e foi ao veterinário!");
	}

	@Override
	public void Alimentar() {
		System.out.println("Está na hora da alimentação!");

	}

	@Override
	public void amamentar() {
		System.out.println("O mamifero está sendo amamentado");
	}

	@Override
	public void emitirSom() {
		System.out.println("O cachorro emite AUAU");
	}

	@Override
	public String toString() {
		return "Cachorro [tamanho=" + tamanho + ", raca=" + raca + ", Nome=" + getNome() + "]";
	}

	
	
	
	
	

}
