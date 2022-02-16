package aula55_enum_values;

import aula53_Enumerados.MesAno;

public class Program02 {

	public static void main(String[] args) {
		
		MesAno mes01 = Enum.valueOf(MesAno.class, "JANEIRO");
		MesAno mes12 = Enum.valueOf(MesAno.class, "DEZEMBRO");
		
		System.out.println(mes12);
		System.out.println(mes01);
		System.out.println(Enum.valueOf(MesAno.class, "MAIO"));

	}

}
