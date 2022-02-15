package aula54_Enum_valores;

public enum DiaSemana {
	
	SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);
	
	private int value;
	
	DiaSemana(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}

}
