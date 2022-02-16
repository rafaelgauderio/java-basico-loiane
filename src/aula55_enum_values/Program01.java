package aula55_enum_values;

import aula53_Enumerados.MesAno;

public class Program01 {

	public static void main(String[] args) {

		MesAno [] meses = MesAno.values();
		
		//fazer um laço para percorrer todos os valores do array
		for(int i=0; i<meses.length ; i++) {
			System.out.println(meses[i]);
		}
		
		System.out.println();
		
		//for each
		for(MesAno apelido : MesAno.values()) {
			System.out.println(apelido);
		}
		

	}

}
