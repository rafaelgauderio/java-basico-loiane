package aula46_interface_heranca;

//interface podem extender varias interfaces ao infinito
//classes nao aceitam heran�a m�ltipla

public interface BancoDados extends SqlDCL, SqlDDL, SqlDML {

	void abrirConexao();

	void fecharConexao();

}
