package aula43_Classe_Object;

import java.util.Arrays;

public class Aluno {

	private String curso;
	private double[] notas;

	public Aluno() {
		super();
	}

	public Aluno(String curso, double[] notas) {
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
	
	@Override
	public String toString() {
		System.out.print("\n");
		String imprimir = curso + "\n";
		for (double apelido : notas) {
			imprimir += "["+apelido +"]"
					;
			
			}
		
		return imprimir;
		
	}

	@Override
	public boolean equals(java.lang.Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (curso == null) {
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		if (!Arrays.equals(notas, other.notas))
			return false;
		return true;
	}
	
	
	
	

}
