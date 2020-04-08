package aula44_Interface;

public class Programa {

	public static void main(String[] args) {

		Cachorro cachorro01 = new Cachorro();

		cachorro01.setNome("Thor");
		cachorro01.setRaca("Golden");
		cachorro01.setTamanho(2);

		System.out.println(cachorro01);

		cachorro01.Alimentar();
		cachorro01.amamentar();
		cachorro01.brincar();
		cachorro01.emitirSom();
		cachorro01.levarAoVeterinario();
		cachorro01.levarPassear();

	}

}
