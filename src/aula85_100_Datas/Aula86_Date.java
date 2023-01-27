package aula85_100_Datas;

import java.util.Date;

public class Aula86_Date {

	public static void main(String[] args) {
		
		System.out.println("Date é Mutável. Date não é constante");
		
		Date today = new Date();
		System.out.println(today);
		
		System.out.println("Tempo em milisegundos desde 1 Janeiro de 1970: " + today.getTime());
		
		System.out.println(today.getDay());
		System.out.println(today.getMonth() + 1); // Janeiro é mês zero
		System.out.println(today.getYear());
		System.out.println(today.getHours());
		System.out.println(today.getMinutes());
		System.out.println(today.getSeconds());
		
		Date birth  = new Date(82,11,17,12,0,0); // 17 de dezembro de 1982 ao meio dia
		System.out.println(birth);
		
		
		

	}

}
