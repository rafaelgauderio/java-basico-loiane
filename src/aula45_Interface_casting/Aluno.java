package aula45_Interface_casting;

public class Aluno extends Pessoa {

	private String curso;
	private double[] notas;

	public Aluno() {
		super();
	}

	public Aluno(String curso, double[] notas) {
		super();
		this.curso = curso;
		this.notas = notas;
	}

	public Aluno(String nome, String endereco, String telefone, String cpf, String telefoneCelular, String curso,
			double[] notas) {
		super(nome, endereco, telefone, cpf, telefoneCelular);
		this.curso = curso;
		this.notas = notas;
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
	
	public String obterEtiquetaEndereco() {
		String label = "Endereço do Aluno: ";
		label += super.getEndereco();
		
		return label;
	}

}
