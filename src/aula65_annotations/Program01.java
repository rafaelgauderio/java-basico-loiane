package aula65_annotations;

@InfoSite (
		author = "Rafael",
		site = "http://delucahigiene.com.br"
)


public class Program01 {
	
	
	@InfoSite(
			author = "De Luca",
			site = "google.com.br"
	)
	
	public static void main(String[] args) {
		
		System.out.println("Annotations: Meta dados que permites embutir informa��es complementares no c�digo:\n");
		System.out.println("1.Informa��es para o compilador\n");
		System.out.println("2.Runtime(tempo de execu��o)\n");
		System.out.println("3.Compile ou Deploy-time(tempo de compila��o ou deploy-web)\n");
		
		System.out.println("Sempre precedita de @. @Override, @Inherited, @SupressWarning");
		
		System.out.println("Muito usado com java web, spring, hibernate, jpa");
		
	
		
		
		
		

	}

}
