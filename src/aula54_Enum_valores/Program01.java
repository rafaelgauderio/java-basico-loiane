package aula54_Enum_valores;

public class Program01 {

	public static void main(String[] args) {
		
		DiaSemana dia = DiaSemana.DOMINGO;
		DiaSemana dia02 = DiaSemana.SEXTA;
		
		System.out.println(dia.toString() + " -- " + dia.getValue());
		System.out.println(dia02.toString() + " -- " + dia.getValue());
		
		Data data = new Data(2,4,2022, DiaSemana.QUARTA);
		System.out.println(data);
		

	}

}
