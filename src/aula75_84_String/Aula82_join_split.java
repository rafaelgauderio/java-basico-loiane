package aula75_84_String;

public class Aula82_join_split {

	public static void main(String[] args) {
		
	String planck = "Planck";
	String euller = "Euller";
	String lorentz = "Lorentz";
	String file = "2459,Rafael de Luca,2500";
	
	String constantes = String.join(" ,",planck, euller, lorentz);
	System.out.println(constantes);
	
	System.out.println();
	
	String [] information = file.split(",");
	
	Cliente cliente01 = new Cliente(Integer.parseInt(information[0]),information[1], Double.parseDouble(information[2]));
	System.out.println(cliente01);
	

	}

}
