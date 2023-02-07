package aula85_100_Utilitarias;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Aula98_BigInteger_BigDecima {

	public static void main(String[] args) {
		
		System.out.println("\nTipos como double, long, int não são ideais para trabalhar com números grandes e/ou com\n"
				+ "números com muitas casas decimais. Para isso isso as Classes BigInteger e BigDecimal.\n");
		
		double double1 = 0.05;
		double double2 = 0.02;
		
		// gera um sujeira 
		System.out.println(double1-double2);
		
		
		BigDecimal bd1 = new BigDecimal("0.05");
		BigDecimal bd2 = new BigDecimal("0.02");
		BigDecimal bd3 = bd1.subtract(bd2);			
		
		System.out.println("\nSubtração");
		System.out.println(bd1.subtract(bd2));
		System.out.println(bd3);
		
		BigInteger bi1 = new BigInteger("1");
		BigInteger bi2 = new BigInteger("3");
		BigInteger bi3 = new BigInteger("9454666666666666666666666666645454");
		//long long1 = 9454666666666666666666666666645454;
				
		BigDecimal bd4 = new BigDecimal("2.35");
		BigDecimal bd5 = new BigDecimal("2.00");
		
		double double3 = 2.35;
		double double4 = 2.00;
		double double5 = 3.00;
		
		// imprimir um int bem grande que não cabe no long
		
		System.out.println("\nBigInteger");
		System.out.println(bi3);
		
		System.out.println("\nDivisão");
		System.out.println(bi1.divide(bi2));
		System.out.println((bd4.divide(bd5)));
		System.out.println(double3/double4);	
		System.out.println(1 / double5);
		
		BigDecimal bd6 = new BigDecimal("5694455646.65945413");
		BigDecimal bd7 = new BigDecimal("156477787646.65945413");
		
		System.out.println("\nMultiplicação");
		System.out.println(bd6.multiply(bd7));
		
		
	}

}
