package aula39_Modificadores_de_acesso_protected;

//Aluno é uma pessoa

public class Aluno extends Pessoa {

	private String curso;
	private double[] notas;

	public Aluno() {

	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double calcularMedia() {
		return 0.0;
	}

	public boolean verificarAprovacao() {
		return false;
	}
	
	public String verificarAcesso () {
		this.nomeVisibilidade="Rafael";
		this.setNomeVisibilidade("Lucas");
		super.nomeVisibilidade="De Luca";
		//Enxer o atributo sexo pois e um subclasse da superclasse Pessoa,
		//mesmo que estivesse em um pacote diferente
		this.sexo="Masculino";
		//enxerga o atributo nomeVisibilidade, pois e defautl enxerga
		//apenas dentro do mesmo pacote
		
		return getNomeVisibilidade();
		
	}

}
