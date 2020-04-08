package aula27_exercicios;

public class ExercicioLampada {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		lampada.modelo = "A70";
		lampada.tensao = "Bivolt";
		lampada.garantiaMeses = 36;
		lampada.potencia = 8;
		lampada.cor = "Branca";
		lampada.tipoDeLuz = "Amarela";

		// instaciar o array de tipos

		lampada.tipos = new String[4];
		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "Lampiao";

		System.out.println("O modelo da lampada: " + lampada.modelo + " e o tipo " + lampada.tipos[1] + ".");
		
		lampada.ligarLampada();
		
		lampada.mostrasEstado();
		
		lampada.desligarLampada();
		
		lampada.mostrasEstado();
		
		lampada.mudarEstado();
		
		lampada.mostrasEstado();

	}

}
