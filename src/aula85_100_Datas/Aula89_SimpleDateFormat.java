package aula85_100_Datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Aula89_SimpleDateFormat {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		System.out.println("SimpleDateFormat é usado quando queremos espeficicar um determinado formato da data e não os padrões do Java");
		
		SimpleDateFormat sdfYear = new SimpleDateFormat("y");
		SimpleDateFormat sdfMonth = new SimpleDateFormat("MM");
		SimpleDateFormat sdfMonthDesc = new SimpleDateFormat("MMM");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdfHour = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		SimpleDateFormat sdfHourZone = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a z");
		
		Calendar cal = new GregorianCalendar(2019,Calendar.MARCH,17,12,30,00);	
		Date today = new Date();
		
		System.out.println(sdfYear.format(cal.getTime()));
		System.out.println(sdfMonth.format(cal.getTime()));
		System.out.println(sdfMonthDesc.format(cal.getTime()).toUpperCase());
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(sdfHour.format(cal.getTime()));
		System.out.println(sdfHourZone.format(cal.getTime()));
		
		System.out.println("\n");
		
		System.out.println(sdf.format(today));
		System.out.println(sdfHour.format(today));
		System.out.println(sdfHourZone.format(today));
		
		// Convertendo String para data
		String  stringData = "17-12-1995";
		SimpleDateFormat sdf01 = new SimpleDateFormat("dd-MM-yyyy");
		
		// Pode dar um exceção de a minha string não estiver no formato do sdf01
		try {
			Date data01 = sdf01.parse(stringData);
			System.out.println("\n" + data01);
			
			// Convertendo de date para String
			System.out.println(sdf.format(data01));
			System.out.println(sdfHourZone.format(data01));
		} catch (ParseException e) {			
			e.printStackTrace();
		}
		
		
		
		
		
		

	}

}
