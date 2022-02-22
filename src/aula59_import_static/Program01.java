package aula59_import_static;


import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.Math.cos;

public class Program01 {

	public static void main(String[] args) {
			
	System.out.println("Se importar como static pode chamar os métodos direto na classe");
	
	
	double a=0.86,b=17,c=81,d=-9;
	
	
	System.out.println(Math.acos(a));
	System.out.println(Math.abs(d));
	System.out.println(Math.pow(b, 3));
	System.out.println(Math.sqrt(c));
	
	System.out.println(sqrt(c));
	System.out.println(cos(30));
	System.out.println(pow(3,4));
		
		
	}

}
