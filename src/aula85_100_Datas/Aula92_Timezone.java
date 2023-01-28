package aula85_100_Datas;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

public class Aula92_Timezone {

	public static void main(String[] args) {

		System.out.println("TimeZones disponíveis");

		String[] timeZones = TimeZone.getAvailableIDs();
		for (String nickname : timeZones) {
			System.out.println(nickname);
		}

		Calendar today = Calendar.getInstance();
		TimeZone currentTimeZone = today.getTimeZone();

		System.out.println("TimeZoneSistema");
		System.out.println(currentTimeZone + "\n");

		// Informando timesZone diferentes
		TimeZone tzPortoNovo = TimeZone.getTimeZone("Africa/Porto-Novo");
		TimeZone tzBuenosAires = TimeZone.getTimeZone("America/Argentina/Buenos_Aires");
		TimeZone tzCanberra = TimeZone.getTimeZone("Australia/Canberra");
		TimeZone tzSaoPaulo = TimeZone.getTimeZone("America/Sao_Paulo");

		List<TimeZone> listaTimeZones = new ArrayList<>();

		listaTimeZones.add(tzPortoNovo);
		listaTimeZones.add(tzBuenosAires);
		listaTimeZones.add(tzCanberra);
		listaTimeZones.add(tzSaoPaulo);

		for (int i = 0; i < listaTimeZones.size(); i++) {
			System.out.println(listaTimeZones.get(i));
			System.out.println(listaTimeZones.get(i).getID());
			System.out.println(listaTimeZones.get(i).getDisplayName());
			System.out.println("********************************************");

		}

		System.out.println("\nCalculando diferente entre 2 TimeZones\n"
				+ "Tem que adicionar as horas de diferente no parâmetro offset\n");

		Calendar nowBuenosAires = Calendar.getInstance(tzBuenosAires);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm a z");
		System.out.println(nowBuenosAires.getTimeZone());
		System.out.println(sdf.format(nowBuenosAires.getTime()));

		System.out.println();

		Calendar nowCanberra = Calendar.getInstance(tzCanberra);
		System.out.println(nowCanberra.getTimeZone());
		System.out.println(sdf.format(nowCanberra.getTime()));

		//nowBuenosAires.add(Calendar.HOUR_OF_DAY, tzBuenosAires.getOffset((System.currentTimeMillis())) / 1000 / 60 / 60);
		System.out.println("\nHorário de São Paulo: " + sdf.format(today.getTime()));
		System.out.println("Horário de Buenos Aires: " + sdf.format(nowBuenosAires.getTime()));

	}

}
