package aula40_Polimorfismo;

//Professor é uma Pessoa

public class Professor extends Pessoa {

	private double salario;
	private String nomeDoCurso;

	public Professor() {
		super();
	}

	public Professor(String nome, String endereco, String telefone, String CPF, String telefoneCelular, double salario,
			String nomeDoCurso) {
		super(nome, endereco, telefone, CPF, telefoneCelular);
		this.salario = salario;
		this.nomeDoCurso = nomeDoCurso;

	}

	public Professor(String nome, String endereco, String telefone, String cpf, String telefoneCelular,
			double salario) {
		super(nome, endereco, telefone, cpf, telefoneCelular);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNomeDoCurso() {
		return nomeDoCurso;
	}

	public void setNomeDoCurso(String nomeDoCurso) {
		this.nomeDoCurso = nomeDoCurso;
	}

	public double calcularSalarioLiquido() {
		return 0.0;
	}
	
	public String obterEtiquetaEndereco() {
		String end = "Endereço do Professor: ";
		end = end + super.getEndereco();
		return end;
	}

		@Override
	public String toString() {
		return "Professor [salario=" + String.format("R$ %.2f", salario) + ", nomeDoCurso=" + nomeDoCurso + "\n"
				+ super.toString() + "]";
	}

}
