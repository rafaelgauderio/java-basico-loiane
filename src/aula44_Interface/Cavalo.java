package aula44_Interface;

public class Cavalo extends Mamifero implements AnimalDomesticado {

	@Override
	public void levarAoVeterinario() {
		System.out.println("O cavalo está indo ao veterinário");

	}

	@Override
	public void Alimentar() {
		System.out.println("O cavalo está sendo alimentado");

	}

	@Override
	public void amamentar() {
		System.out.println("A égua está amamentando");

	}

	@Override
	public void emitirSom() {
		System.out.println("O cavalo de nome " + getNome() + " está relinchar");

	}

}
