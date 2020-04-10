package aula46_interface_heranca;

//interface podem extender varias interfaces ao infinito
//classes nao aceitam herança múltipla

public interface BancoDados extends SqlDCL, SqlDDL, SqlDML {

	void abrirConexao();

	void fecharConexao();

}
