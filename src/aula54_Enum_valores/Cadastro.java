package aula54_Enum_valores;

//fazer isso para mostra algo mais detalhado ao usuário e na hora de salvar no banco de dados
//salvar apenas um caracter para econimizar espaço em disco
public class Cadastro {
	
	private String nome;
	private String genero;
	
		
	
	public Cadastro(String nome, String genero) {
		super();
		this.nome = nome;
		this.genero = genero;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getGenero() {
		return genero;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}



	enum Genero {
		
		MASCULINO('M'),
		FEMININO('F');
		
		private char value;
		
		Genero(char value) {
			this.value=value;
		}
		
		
		
		
	}
	
	
}
