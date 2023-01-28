package aula85_100_Datas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Aula93_API_Data_Java8 {

	public static void main(String[] args) {
		
		System.out.println("Método parse retorna uma data e por isso pode dar exceção\n"
				+ "Método format retorna uma String");
		
		System.out.println("\nApenas Datas no Formato ISO");
		
		LocalDate birth = LocalDate.parse("1982-12-17");
		LocalDate birth02 = LocalDate.of(1982,12,17);
		LocalDate now = LocalDate.now();
		
		System.out.println(birth);
		System.out.println(birth02);
		System.out.println(now);
		
		System.out.println("\nOperações com Data");
		System.out.println(now.plusDays(20));
		System.out.println(now.plusMonths(2));
		System.out.println(now.plusYears(1));
		System.out.println(now.minusDays(10));
		System.out.println(now.minusWeeks(5));
		System.out.println(now.minusYears(3));
		
		System.out.println(now.plus(10, ChronoUnit.DAYS));
		System.out.println(now.plus(1, ChronoUnit.DECADES));
		System.out.println(birth.minus(2,ChronoUnit.WEEKS));
		
		//métodos get
		System.out.println(birth.getDayOfMonth());
		System.out.println(birth.getYear());
		System.out.println(birth02.getMonthValue());
		
		// métodos booleanos
	
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println(birth.isLeapYear());
		System.out.println(now.isLeapYear());
		System.out.println(LocalDate.parse("2022-12-15").isEqual(LocalDate.parse("2022-12-15")));
		System.out.println(birth.isBefore(now));
		
		System.out.println("\nLocalTime");
		
		LocalTime midday = LocalTime.parse("12:00");
		LocalTime midday02 = LocalTime.NOON;
		LocalTime nowTime = LocalTime.now();
		
		System.out.println(midday);
		System.out.println(midday02);
		System.out.println(nowTime);
		System.out.println(LocalTime.of(19,45,30));
		System.out.println(LocalTime.parse("07:20"));
		// Operações com hora
		System.out.println(midday.plusMinutes(30));
		System.out.println(midday.plusHours(3));
		System.out.println(nowTime.minusHours(5));
		System.out.println(midday.minus(1,ChronoUnit.HOURS).plus(20,ChronoUnit.MINUTES));
		
		System.out.println(nowTime);
		System.out.println(nowTime.getHour());
		System.out.println(nowTime.getMinute());
		System.out.println(nowTime.getSecond());

	}

}
