package aula64_classes_aninhadas;

public class External2 {
	
	public void printMethod() {
		//classe dentro de um m�todo
		//esse classe s� fica dispon�vel dentro desse m�todo
		class LocalClass {
			
			private String Localtext = "Text local class";
			
			public void printText() {
				
				System.out.println(Localtext);
				
			}
			
			
		}
		
		LocalClass local = new LocalClass();		
		local.printText();
		
		
	}
	
	public static void main (String [] args) {
		
		
		External2 external = new External2();
		
		external.printMethod();
		
	}
	
	
	

}
