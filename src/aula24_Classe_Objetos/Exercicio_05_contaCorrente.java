package aula24_Classe_Objetos;

public class Exercicio_05_contaCorrente {
	
	//array de string chamados de args
	
	public static void main (String [] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.numero = 60784;
		conta.agencia="3028-x";
		conta.especial=true;
		conta.limiteEspecial=500.00;
		conta.saldo=200;
		
		System.out.println("O saldo da conta de numero: "+ conta.numero +" = "+String.format("R$ %.2f", conta.saldo));
		
		
		System.out.println("Saque de 600 reais");
		boolean saqueRealizado = conta.saque(600);
		
		
		
		if (saqueRealizado == true) {
			
			System.out.println("Saque realizado com sucesso");
			System.out.println("cheque especial: "+conta.limiteEspecial) ;			
			System.out.println("Saldo atual da conta " +conta.saldo);
		} 
		else {
			System.out.println("Nao foi possivel realizar o saque. Saldo insuficiente");
			System.out.println("saldo: "+conta.saldo+" , cheque especial: "+conta.limiteEspecial) ;
		}
		
		System.out.println("Deposito de 900 reais");
		
		conta.deposito(900);
		
		conta.cosultarSaldo();
		
		conta.verificarUsaChequeEspecial();
		
		conta.saque(700);
		conta.cosultarSaldo();
		conta.verificarUsaChequeEspecial();
		
		
		
		
	}



}
