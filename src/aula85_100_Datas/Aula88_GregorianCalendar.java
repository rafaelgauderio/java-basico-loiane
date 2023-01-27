package aula85_100_Datas;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Aula88_GregorianCalendar {

	public static void main(String[] args) {
		
		System.out.println("GregoriamCalendar extends Calendar. Ou seja, é uma subclasse da classe pai Calendar\n");
		
		Calendar today = Calendar.getInstance();
		
		
		GregorianCalendar todayGregorian = new GregorianCalendar ();
		GregorianCalendar birthCalendar = new GregorianCalendar (1982, 11,17);
		GregorianCalendar birthCalendarTime = new GregorianCalendar (1982, 11,17, 12,30,0); // mês começa em zero
		
		System.out.println("2022 é ano Bissexto: " + todayGregorian.isLeapYear(2022));
		System.out.println("2022 é ano Bissexto: " + todayGregorian.isLeapYear(2000));
		
		printDate(today);
		printDate(birthCalendar);
		printDate(birthCalendarTime);
		
		System.out.println("\n");
		System.out.println(today);
		System.out.println(birthCalendar);
		System.out.println(birthCalendarTime);
		

	}
	
	public static void printDate (Calendar data)  {
		int day = data.get(Calendar.DAY_OF_MONTH);
		int month = data.get(Calendar.MONTH);
		int year = data.get(Calendar.YEAR);
		
		int hour = data.get(Calendar.HOUR_OF_DAY);
		int minute = data.get(Calendar.MINUTE);
		int seconds = data.get(Calendar.SECOND);
		
		System.out.printf("Hoje : %02d/%02d/%d %02d:%02d:%02d\n", day, (month+1), year, hour, minute, seconds);
	}
			

}
