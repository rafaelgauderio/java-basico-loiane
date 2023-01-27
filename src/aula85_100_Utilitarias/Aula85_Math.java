package aula85_100_Utilitarias;

public class Aula85_Math {

	public static void main(String[] args) {
		
		System.out.println("Java tem algums problemas de trabalhar com números com muitas casas decimais\n"
				+ "Para resolver isso foram criadas as classes BigDecimal e BidInteger");
		
		System.out.println("\nMétodos de arredontamento");		
		System.out.println(Math.round(5.8));
		System.out.println(Math.round(5.3));
		System.out.println(Math.round(4.49));
		System.out.println(Math.round(4.5));		
		System.out.println("Arredonda pra cima: " + Math.ceil(17.2));
		System.out.println("Arredonda pra baixo: " + Math.floor(15.9));
		System.out.println("Valor absoluto: " + Math.abs(-45.6));
		System.out.println("Quociente: " + Math.floorDiv(10,3));
		System.out.println("Resto: " + Math.floorMod(16, 3));
		
		System.out.println("\nMétodo Trigonométricos");
		System.out.println(Math.sin(Math.toRadians(30)));
		System.out.println(Math.cos(Math.toRadians(60)));
		System.out.println(Math.cos(Math.toRadians(45)));
		System.out.println(Math.tan(Math.toRadians(45)));
		System.out.println(Math.round(Math.tan(Math.toRadians(45))));
		System.out.println(Math.round(Math.toDegrees(Math.asin(0.5))));

		System.out.println("\nMétodos de exponenciais");
		System.out.println(Math.pow(2, 9));
		System.out.println(Math.pow(2, 10));
		System.out.println(Math.sqrt(64));
		System.out.println(Math.sqrt(121));
		System.out.println(Math.cbrt(3375));
		System.out.println(Math.cbrt(27));
		System.out.println(Math.log(2.71828182));
		
		
		
		
		
		
		
		

	}

}
