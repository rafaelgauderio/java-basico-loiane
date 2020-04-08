package aula45_Interface_casting;

public class Professor extends Pessoa {

	private double salario;
	private String nomeCurso;

	public Professor() {

	}

	public Professor(String nome, String endereco, String telefone, String cpf, String telefoneCelular, double salario,
			String nomeCurso) {
		super(nome, endereco, telefone, cpf, telefoneCelular);
		this.salario = salario;
		this.nomeCurso = nomeCurso;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public double caucularSalarioLoquido () {
		double imposto = salario * 	0.25;
		return salario - imposto;
	}
	
	public String obterEtiquetaEndereco() {
		String label = "Endereço do Professor";
		label += super.getEndereco();
		
		return label;
	}

}
