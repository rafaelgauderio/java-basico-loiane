package aula46_interface_heranca;

public class BancoMySQL implements BancoDados {

	public void grant(String access) {
		System.out.println("Garantir acesso ao Banco de dados");
	}

	@Override
	public void remoke(String access) {
		System.out.println("Lembrar acesso ao Banco de dados");

	}

	@Override
	public void create(String query) {
		System.out.println("Criar uma Tabela/Banco no Banco de dados");

	}

	@Override
	public void alter(String query) {
		System.out.println("Alterar uma Tabela/Banco do Banco de dados");

	}

	@Override
	public void drop(String query) {
		System.out.println("Parar uma Tabela/Banco do Banco de dados");

	}

	@Override
	public void select(String query) {
		System.out.println("Selecionar um registro e fazer um consulta no Banco de Dados");

	}

	@Override
	public void insert(String query) {
		System.out.println("Inserir um registro no Banco de dados");

	}

	@Override
	public void delete(String query) {
		System.out.println("Excluir um registro do Banco de dados");

	}

	@Override
	public void update(String query) {
		System.out.println("Atualizar/Alterar um registro no Banco de dados");

	}

	@Override
	public void abrirConexao() {
		System.out.println("Abrir conexão com Banco de dados");

	}

	@Override
	public void fecharConexao() {
		System.out.println("Fechar conexão com Bando de dados");

	}

}
