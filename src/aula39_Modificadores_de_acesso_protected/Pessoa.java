package aula39_Modificadores_de_acesso_protected;

//Pessoa eh uma super classe da classe Aluno e Professor

public class Pessoa {

	// private so visivel dentro da propria classe (encapsular)
	// declarar get e set para outras classes poderem acessar.
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	private String telefoneCelular;
	// no default e visivel dentro do pacote
	String nomeVisibilidade;
	// public todo mundo enxerga, mesmo de outro pacote
	public String nomeDiferente;
	//protected parecido com default so que as subclasses nao importa o pacote que
	//estejam tambem tem acesso
	protected String sexo;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public String getNomeVisibilidade() {
		return nomeVisibilidade;
	}

	public void setNomeVisibilidade(String nomeVisibilidade) {
		this.nomeVisibilidade = nomeVisibilidade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	

}
