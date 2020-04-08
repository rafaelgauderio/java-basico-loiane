package aula27_exercicios;

public class Lampada {

	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoDeLuz;
	int garantiaMeses;
	String[] tipos; // array de tipos
	boolean ligado;

	void ligarLampada() {
		ligado = true;
	}

	void desligarLampada() {
		ligado = false;
	}
	
	void mostrasEstado() {
		if (ligado==true) {
			System.out.println("A lampada esta ligada.");
		}
		else {
			System.out.println("A lampada esta desligada.");
		}
	}
	
	void mudarEstado () {
		if (ligado) {
			desligarLampada();
		}
		else {
			ligarLampada();
		}
	}
	

}
