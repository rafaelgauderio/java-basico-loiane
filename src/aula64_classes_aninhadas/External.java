package aula64_classes_aninhadas;

public class External {
	
	
	private String extertText = "EXTERNAL  class text";
	
	public class Internal {
		public void printText() {
			
			System.out.println(extertText);
			//um método dentro da classe consegue ver membros da classe externa
			System.out.println(External.this.extertText);	
		}
	
		
	}	
	
	
	public static void  main (String [] args) {
		
		
		External external = new External();
		//Internal internal = new Internal(); erro de compilação
		Internal internal = external.new Internal();
		
		internal.printText();
		
		
		
	}

}
