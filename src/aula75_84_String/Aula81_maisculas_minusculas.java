package aula75_84_String;

public class Aula81_maisculas_minusculas {
	
	public static void main(String [] args) {
		
		
		String rafaelMai = "RAFAEL";
		String rafael = "rafael";
		String rafaelMin = "rafael de luca";
		
		System.out.println(rafaelMai.toLowerCase());
		System.out.println(rafaelMin.toLowerCase());
		
		System.out.println(rafaelMai.toUpperCase());
		System.out.println(rafaelMin.toUpperCase());
		
		System.out.println(rafaelMai.toLowerCase().equals(rafael.toLowerCase()));
		
		
	}
}
