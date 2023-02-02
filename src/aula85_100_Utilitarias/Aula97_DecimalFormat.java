package aula85_100_Utilitarias;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Aula97_DecimalFormat {

	public static void main(String[] args) {
		
		System.out.println("DecimalFormat é um classe que exteds a NumberFormat\n"
				+ "Usado quando se faze necessário mais precisão nas cadas decimais\n");
		
		String padraoAmericado = "###,###.##";			
		
		
		DecimalFormatSymbols dfsUsa = new DecimalFormatSymbols(Locale.US);
		dfsUsa.setDecimalSeparator('.');
		dfsUsa.setGroupingSeparator(',');
		
		DecimalFormat dfUsa = new DecimalFormat(padraoAmericado,dfsUsa);
		System.out.println(dfUsa.format(545154454946.50));	
		
		DecimalFormatSymbols dfsBra = new DecimalFormatSymbols(Locale.getDefault());
		dfsBra.setDecimalSeparator(',');
		dfsBra.setGroupingSeparator('.');
		
		DecimalFormat dfBra = new DecimalFormat(padraoAmericado, dfsBra);
		System.out.println(dfBra.format(545154454946.50));
		
		String padraoMoeda = "\u00A4###,###,##0.00%";
		DecimalFormat dfMoeda = new DecimalFormat(padraoMoeda, dfsUsa);
		System.out.println(dfMoeda.format(.9));
		System.out.println(dfMoeda.format(1.2));
		
		
	

	}

}
