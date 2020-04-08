package aula31_Public_Private;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro novoCarro = new Carro();
		
		/*
		 * Somente aparece parametros default e pulic, os private,
		 * somente atraves de getter and setter.
		 * marca public / capcambustivel private
		 */
		
		novoCarro.marca ="Ford";
		novoCarro.setCapCombustivel(15);

	}

}
