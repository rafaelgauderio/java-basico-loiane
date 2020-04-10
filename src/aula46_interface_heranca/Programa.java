package aula46_interface_heranca;

public class Programa {
	
	public static void main (String [] args) {
		
		BancoMySQL novoBanco = new BancoMySQL() ;
		
		novoBanco.abrirConexao();
		novoBanco.fecharConexao();
		
		System.out.println("\n");
		
		novoBanco.create("Banco Teste");
		novoBanco.create("Tabela Funcionários");
		novoBanco.alter("Tabela Funcionários");
		novoBanco.drop("Banco Teste");
		
		System.out.println("\n");
		
		novoBanco.grant("Usuário admin");
		novoBanco.remoke("Usuário admin");
		
		System.out.println("\n");
		
		novoBanco.insert("Rafael De Luca");
		novoBanco.update("Rafael De Luca");
		novoBanco.select("Rafael De Luca");
		novoBanco.delete("Rafael De Luca");
		
		
	}

}
