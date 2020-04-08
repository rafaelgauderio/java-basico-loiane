package aula44_Interface;

public class Cavalo extends Mamifero implements AnimalDomesticado {

	@Override
	public void levarAoVeterinario() {
		System.out.println("O cavalo est� indo ao veterin�rio");

	}

	@Override
	public void Alimentar() {
		System.out.println("O cavalo est� sendo alimentado");

	}

	@Override
	public void amamentar() {
		System.out.println("A �gua est� amamentando");

	}

	@Override
	public void emitirSom() {
		System.out.println("O cavalo de nome " + getNome() + " est� relinchar");

	}

}
