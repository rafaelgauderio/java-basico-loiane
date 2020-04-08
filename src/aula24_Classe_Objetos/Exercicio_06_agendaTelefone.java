package aula24_Classe_Objetos;

public class Exercicio_06_agendaTelefone {

	public static void main(String[] args) {
	
		Contato contato = new Contato();
		
		contato.nome="Juliana";
		contato.endereco="Rua Brasil 120";
		contato.email="juliana@gmail.com";
		
		//instanciar o tamanho do vetor de telefones;
		
		contato.telefones = new int[3];
		contato.telefones[0] = 99925657;
		contato.telefones[1]= 99934567;
		contato.telefones[2]= 99894568;
		
		System.out.println(contato.nome+ " e o telefone principal = "+contato.telefones[0]);
		
	}

}
