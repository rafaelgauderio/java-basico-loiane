package aula40_Polimorfismo;

import java.util.Arrays;

//Aluno é uma pessoa

public class Aluno extends Pessoa {

	private String curso;
	private double[] notas;

	public Aluno() {
		super();
	}

	public Aluno(String nome, String endereco, String telefone, String cpf, String telefoneCelular, String curso,
			double[] notas) {
		super(nome, endereco, telefone, cpf, telefoneCelular);
		this.curso = curso;
		this.notas = notas;

	}

	public Aluno(String curso, double[] notas) {
		super();
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

	public double calcularMedia() {
		return 0.0;
	}

	public boolean verificarAprovacao() {
		return false;
	}
	
	public String obterEtiquetaEndereco() {
		String end = "Endereço do Aluno: ";
		end = end + super.getEndereco();
		return end;
	}


	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas)+"\n"
	+ super.toString() + "]";
	}


	

	
	

}
