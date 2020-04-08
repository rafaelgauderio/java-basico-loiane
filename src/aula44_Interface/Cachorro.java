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
		System.out.println("Este cachorro de nome " +getNome()+  " est� brincando!");

	}

	@Override
	public void levarPassear() {
		System.out.println("Animalzinho saindo para passear!");

	}

	@Override
	public void levarAoVeterinario() {
		System.out.println("Animal est� doente e foi ao veterin�rio!");
	}

	@Override
	public void Alimentar() {
		System.out.println("Est� na hora da alimenta��o!");

	}

	@Override
	public void amamentar() {
		System.out.println("O mamifero est� sendo amamentado");
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
