package aula24_Classe_Objetos;

public class ContaCorrente {

	int numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUtilizado;
	double saldo;

	boolean saque(double valorSaque) {
		// se tem saldo na conta
		if (saldo >= valorSaque) {
			saldo = saldo - valorSaque;
			return true;
		} // se nao tem saldo na conta
		else {
			if (especial == true) {
				double limite = limiteEspecial + saldo;
				if (limite >= valorSaque) {
					saldo = saldo - valorSaque;
					return true;
				} else {
					return false;
				}
			} else {
				return false;
				// nao tem cheque especial e nao tem saldo suficiente

			}
		}

	}

	void deposito(double valorDepositado) {
		saldo = saldo + valorDepositado;
	}

	void cosultarSaldo() {

		System.out.println("Saldo da conta:" + String.format("R$ %.2f", saldo));

	}

	void verificarUsaChequeEspecial() {
		if (saldo > 0) {
			System.out.println("Nao esta no esque especial");
		}
		else {
			System.out.println("Cliente esta no cheque especial");
			
		}
		
		
	}

}
