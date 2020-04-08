package aula44_Interface;

public class Papagaio extends Ave{

	@Override
	public void voar() {
		System.out.println("O papaio "+ getNome()+ " está voando!");
		
	}

	@Override
	public void emitirSom() {
		
		System.out.println("O papagaio fala LORO, LORO.");		
	}
	
	

}
