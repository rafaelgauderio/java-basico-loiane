package aula45_Interface_casting;

public class Programa2 {

	public static void main(String[] args) {
		
		Object objeto01 = obterString();
		String s1 = (String) objeto01;
		
		Object objeto02 = "Uma String";
		String s2 = (String) objeto02;
		
		//Object objeto03 = new Object() ;
		//String s3 = (String) objecto03;
		
		//erro apenas na hora de compilacao
		// Object objeto04 = obterInteiro();
		// String s4 = (String) objeto04;
		
		System.out.println(s1);
		System.out.println(s2);
		

	}
	
	public static String obterString() {
		return "Uma String qualquer";
	}
	
	public static int obterInteiro() {
		return 1;
	}

}
