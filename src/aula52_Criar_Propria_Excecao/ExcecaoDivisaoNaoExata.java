package aula52_Criar_Propria_Excecao;

public class ExcecaoDivisaoNaoExata extends Exception {

	private int numerador;
	private int denominador;

	public ExcecaoDivisaoNaoExata(int num, int denom) {

		super();
		this.numerador = num;
		this.denominador = denom;

	}

	@Override
	public String toString() {

		return "O resultado da opera��o " + numerador + "/" + denominador + ", n�o � um n�mero inteiro!";
	}

}
