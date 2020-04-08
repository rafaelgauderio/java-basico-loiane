package aula42_Palavra_Final;



public class Teste {
	// ao colocar a palavra final a classe nao pode ser extendida
	//Nao tem mais como instanciar Aluno e Professor como uma subclasse
	//da super classe Pessoa
	
	//padrao de constante é CAIXA ALTA
	
	public static final double PHI=3.14159265;
	

	public static void main(String[] args) {
		
	Pessoa pesssoa = new Pessoa();
	//Pessoa aluno = new Aluno();
	//Pessoa professor = new Professor();
	Aluno aluno = new Aluno();
	Professor professor = new Professor();	
	
	System.out.println(Constantes.URL_SITE);
	System.out.println(Constantes.URL_ECOMMERCE);
	System.out.println("Constante Pi: "+String.format("%.3f",PHI));
		

	}

}
