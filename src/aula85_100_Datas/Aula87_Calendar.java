package aula85_100_Datas;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class Aula87_Calendar {

	public static void main(String[] args) {

		System.out.println("Classe Calendar é uma classe abstrata, ou seja, não pode ser Instantiada\n"
				+ "Classe Calendar utiliza o padrão de projeto SINGLETON\n");
		
		Calendar today = Calendar.getInstance();
		Calendar locale = Calendar.getInstance(Locale.FRANCE);
		Calendar timezone = Calendar.getInstance(TimeZone.getTimeZone("America/São_Paulo"));
		Calendar timezone2 = Calendar.getInstance(TimeZone.getTimeZone("Brazil/East"));
		
		System.out.println(today);
		System.out.println(locale);
		System.out.println(timezone);
		System.out.println(timezone2);
				
		int day = today.get(Calendar.DAY_OF_MONTH);
		int month = today.get(Calendar.MONTH);
		int year = today.get(Calendar.YEAR);
		
		int hour = today.get(Calendar.HOUR_OF_DAY);
		int minute = today.get(Calendar.MINUTE);
		int seconds = today.get(Calendar.SECOND);
		
		System.out.printf("\nHoje : %02d/%02d/%d %02d:%02d:%02d", day, (month+1), year, hour, minute, seconds);
		
		System.out.println(Calendar.DAY_OF_WEEK);
		System.out.println(Calendar.FEBRUARY);
		System.out.println(Calendar.DAY_OF_YEAR);
		System.out.println(today.get(Calendar.DAY_OF_MONTH));
		System.out.println(Calendar.WEEK_OF_YEAR);
		System.out.println(Calendar.FRIDAY);
		
		System.out.println("\nOperações com Calendar");
		today.add(Calendar.DAY_OF_MONTH, -1);
		System.out.println("Ontem: " + today.get(Calendar.DAY_OF_MONTH));
		today.add(Calendar.DAY_OF_MONTH, +2);
		System.out.println("Amanhã: " + today.get(Calendar.DAY_OF_MONTH));

	}

}
