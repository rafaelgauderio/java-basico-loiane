package aula85_100_Datas;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Aula91_DateFormat {

	public static void main(String[] args) {
		
		System.out.println("\nDateFormat é uma classe abstrata e não pode ser instanciada.\n"
				+ "DateFormat é mais recomendável usar quando se trabalhar com a classe Locale\n"
				+ "Método format retorna uma String\n"
				+ "Método parse retorna uma Date\n");
		
		System.out.println(Locale.getDefault());
		
		Date today = new Date();
		String formatToday = DateFormat.getInstance().format(today);
		
		// apenas a data
		System.out.println(formatToday);
		
		// apenas hora
		System.out.println(DateFormat.getTimeInstance().format(today));
		
		// data e hora
		System.out.println(DateFormat.getDateTimeInstance().format(today));
		
		// informa o formato da Hora depois formato da Data e depois a data
		System.out.println("\nFormatos CURTOS de somente hora, somente data, data e hora");
		System.out.println(DateFormat.getTimeInstance(DateFormat.SHORT).format(today));		
		System.out.println(DateFormat.getDateInstance(DateFormat.SHORT).format(today));
		System.out.println(DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(today));		
		
		System.out.println("\nFormatos MÉDIOS de somente hora, somente data, data e hora");
		System.out.println(DateFormat.getTimeInstance(DateFormat.MEDIUM).format(today));		
		System.out.println(DateFormat.getDateInstance(DateFormat.MEDIUM).format(today));
		System.out.println(DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM).format(today));
		
		System.out.println("\nFormatos LONGOS de somente hora, somente data, data e hora");
		System.out.println(DateFormat.getTimeInstance(DateFormat.LONG).format(today));
		System.out.println(DateFormat.getDateInstance(DateFormat.LONG).format(today));
		System.out.println(DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(today));;
		
		System.out.println("\nConvertendo de String para Data. Pode dar erro de exceção se estiver em formato errado");
		
		String data = "17/12/1982 15:30:30";
		
		try {
			Date dateBirth = DateFormat.getInstance().parse(data);
			System.out.println(dateBirth);
		} catch (ParseException error) {
			
			error.printStackTrace();
		}
		
		System.out.println("\nData no formato Calender");
		Calendar cal = Calendar.getInstance();
		cal.setTime(today);
		System.out.println(cal);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		
		
	}

}
