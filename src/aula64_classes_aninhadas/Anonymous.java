package aula64_classes_aninhadas;


public class Anonymous {

	public void printText() {

		System.out.println("Print text method anonymous");

	}


	public static void main (String [] args) {

		//coloca o ; apenas após fechar a classe anônima
		Anonymous anonymous = new Anonymous() {

			public void printText() {
				System.out.println("Overwrite the method printText");
			}		
		};
		
		anonymous.printText();
		//classe anonimas podem implemenar iternaces
		//using the interface
		//instanciando a interface como classe anonima
		InterfaceText text = new InterfaceText() {
			
			@Override
			public void interfaceText() {
				System.out.println("Print text - implemented interface" );
				
			}
		};
		
		text.interfaceText();

	}

}
