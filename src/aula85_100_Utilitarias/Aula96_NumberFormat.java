package aula85_100_Utilitarias;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Aula96_NumberFormat {

	public static void main(String[] args) {
		
		// utilizada para formatar número que não exigem muita precisão com casas decimais
		
		Double numero = 500900.50;		
		Locale brazil = new Locale("pt","BR");
		Locale.setDefault(brazil);		
		NumberFormat nfBrazil = NumberFormat.getCurrencyInstance();
		
		System.out.println(nfBrazil.format(numero));
		
		// usando o padrão americado
		Locale.setDefault(Locale.US);
		NumberFormat nfUsa = NumberFormat.getCurrencyInstance(Locale.getDefault());	
		
		System.out.println(nfUsa.format(numero));
		
		
		//moeda
		Currency moedaBrazil = nfBrazil.getCurrency();
		Currency moedaUsa = nfUsa.getCurrency();
		
		System.out.println("\nMoeda");
		System.out.println(moedaBrazil);
		System.out.println(moedaUsa);
		System.out.println(moedaBrazil.getDisplayName());
		System.out.println(moedaUsa.getDisplayName());
		
		//arredontamento
		
		NumberFormat nfPadrao = NumberFormat.getInstance();
		
		nfPadrao.setMaximumFractionDigits(1);
		nfPadrao.setMinimumFractionDigits(1);		
		
		nfPadrao.setRoundingMode(RoundingMode.DOWN);
		System.out.println("\nArredontamento");
		System.out.println(nfPadrao.format( 500.45));
		
		nfPadrao.setRoundingMode(RoundingMode.UP);
		System.out.println(nfPadrao.format(500.45));
		
		nfPadrao.setRoundingMode(RoundingMode.CEILING);
		System.out.println(nfPadrao.format( 500.45));
		
		nfPadrao.setRoundingMode(RoundingMode.HALF_DOWN);
		System.out.println(nfPadrao.format(500.45));
		
		nfPadrao.setRoundingMode(RoundingMode.HALF_UP);
		System.out.println(nfPadrao.format(500.45));
		
		nfPadrao.setRoundingMode(RoundingMode.FLOOR);
		System.out.println(nfPadrao.format(500.45));
		
		
		// Porcentagem
		Locale.setDefault(brazil);
		System.out.println("/nPorcentagem");
		
		NumberFormat percentual = NumberFormat.getPercentInstance();
		System.out.println(percentual.format(0.5));
		System.out.println(percentual.format(0.75));
		
		percentual.setMaximumIntegerDigits(10);
		percentual.setMaximumIntegerDigits(5);
		percentual.setMaximumFractionDigits(2);
		percentual.setMinimumFractionDigits(2);
		
		System.out.println(percentual.format(0.5580787454549454));
		
		
		
		
		
		
		
		

	}

}
