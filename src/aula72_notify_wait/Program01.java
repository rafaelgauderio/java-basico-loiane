package aula72_notify_wait;

public class Program01 {

	public static void main(String[] args) {


		System.out.println("Thread sendo executada sentro de um m�todo sincronizado e precisa acessar um recurso indispon�vel.\n"
				+ "A solu��o � liberar temporariamente ap controle do objeto, permitindo que outra thread seja executada.\n"
				+ "\twait() - bloqueia a thread temporiamente at� ela ser notificada.\n"
				+ "\tnotify - retorna a execuca��o de uja thread que estava em estado wait.\n"
				+ "\tnotifiAll - retorna todas as threads em wait, vai ter acesso ao objeto a thread de maior prioridade.\n");

		Clock ticTack = new Clock();

		ThreadClock tic = new ThreadClock("Tic", ticTack);
		ThreadClock tack = new ThreadClock("Tack", ticTack);

		try {
			tic.getThread().join();
			tack.getThread().join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}



	}

}
