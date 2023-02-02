package aula85_100_Datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Aula94_DiferencaEntreDatas {

	public static void main(String[] args) throws ParseException {

		System.out.println("*****************************************");	
		System.out.println("Difenreça de datas antes da API java 8");
		diferenteEntreDatasAntesJava8();

		System.out.println("*****************************************");		
		System.out.println("Diferença entre dadas com API java 8");
		Aula94_DiferencaEntreDatas diferenca = new Aula94_DiferencaEntreDatas();
		diferenca.diferencaDataAPIJava8();
		
		System.out.println("*****************************************");
		diferencaEntreDatasComTempo();
		
		System.out.println("*****************************************");
		diferencaEntreDataComChronoUnit();
		
		

	}

	public static void diferenteEntreDatasAntesJava8() throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date nascimento = sdf.parse("17/12/1982");
		Date hoje = new Date();

		long diferencaMilisegundos = Math.abs(hoje.getTime() - nascimento.getTime());
		long diferencaEmdias = TimeUnit.DAYS.convert(diferencaMilisegundos, TimeUnit.MILLISECONDS);

		Integer dias = (int) (diferencaMilisegundos / (1000 * 60 * 60 * 24));
		Integer idade = dias / 365;

		System.out.println("Idade em Milisegundos: " + diferencaMilisegundos);
		System.out.println("Idade em dias: " + diferencaEmdias);
		System.out.println("Idade em dias: " + dias);
		System.out.println("Idade em anos: " + idade);

	}

	public void diferencaDataAPIJava8 () {
		LocalDate nascimento = LocalDate.of(1982,12,17);
		LocalDate hoje = LocalDate.now();
		
		//Period periodo = Period.between(startDateInclusive, endDateExclusive);
		Period periodo = Period.between(nascimento,hoje);
		
		int dias = periodo.getDays();
		int meses = periodo.getMonths();
		int anos = periodo.getYears();	
		Period menos15 = periodo.minusYears(15);		
		
		System.out.println("Dias: " + dias);
		System.out.println("Meses: " + meses);
		System.out.println("Anos: " + anos);
		System.out.println("Menos 15: " + menos15.getYears());			
	}
	
	public static void diferencaEntreDatasComTempo () {
		
		LocalDateTime nascimento = LocalDateTime.of(1982,12,17,12,30);
		LocalDateTime hoje = LocalDateTime.now();
		
		Duration duracao = Duration.between(nascimento, hoje);
		
		long minutos = duracao.toMinutes();
		long horas = duracao.toHours();
		
		System.out.println("Segundos: "+ duracao.getSeconds());
		System.out.println("Minutos: " + minutos);
		System.out.println("Horas: "+ horas);		
		
	}
	
	public static void diferencaEntreDataComChronoUnit() {
		
		LocalDateTime nascimento = LocalDateTime.of(1982,12,17,12,30);
		LocalDateTime hoje = LocalDateTime.now();
		
		long horas = ChronoUnit.HOURS.between(nascimento, hoje);
		long dias = ChronoUnit.DAYS.between(nascimento, hoje);
		long anos = ChronoUnit.YEARS.between(nascimento, hoje);
		long decadas = ChronoUnit.DECADES.between(nascimento, hoje);
		
		System.out.println("Horas: " + horas);
		System.out.println("Dias: " + dias);
		System.out.println("Anos: " + anos);
		System.out.println("Decadas: " + decadas);		
		
	}

}
