package aula85_100_Datas;

import java.text.NumberFormat;
import java.util.Locale;

public class Aula90_locale {

	public static void main(String[] args) {

		System.out.println(Locale.getDefault());
		Locale.setDefault(Locale.US);
		System.out.println(Locale.getDefault());

		// array com as regiões disposíveis, mas mesmo assim é possível
		// criar novos Locales

		Locale[] localizacoes = Locale.getAvailableLocales();

			
		for (int i =1 ; i < localizacoes.length; i++) {
			
			System.out.println("Código País: " + localizacoes[i].getCountry());
			System.out.println("Nome do País" + localizacoes[i].getDisplayCountry());			
			System.out.println("Nome Locale: " + localizacoes[i].getDisplayName());
			System.out.println("Código País: " + localizacoes[i].getLanguage());
			System.out.println("Nome do País: " + localizacoes[i].getDisplayLanguage());
			System.out.println("--------------------------------------------------------");
			
		}
				
		Locale brazil = new Locale("pt","BR");
		Locale.setDefault(brazil);
		
		System.out.println("\nMétodo formata retorna uma String");
		System.out.println("Número grande em diveferentes Locales");
		NumberFormat nfBrazil = NumberFormat.getCurrencyInstance();
		System.out.println(nfBrazil.format(97383890000000.50));
		
		NumberFormat nfUsa = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nfUsa.format(21597383890000000.99));		

		NumberFormat nfFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println(nfFrance.format(1597383890000000.99));
		
		NumberFormat nfJapan = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		System.out.println(nfJapan.format(2821872762620000.99));
		
		
		
	}

}
