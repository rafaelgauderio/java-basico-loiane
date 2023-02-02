package aula85_100_Datas;

import java.util.Locale;
import java.util.ResourceBundle;

public class Aula95_ResourceBundle {

	public static void main(String[] args) {
		
		System.out.println("Resource Bunlde utiliza de arquivos para trocar o local e Internacionalizar um projeto");
		
		Locale locale = Locale.getDefault();
		System.out.println("Locale do sistema: " + locale + "\n");
		
		// nome do arquivo salvo na raiz do projeto
		ResourceBundle rb = ResourceBundle.getBundle("resourceBundle");
		
		System.out.println(rb.getString("mensagem") + " Rafael de Luca");
		System.out.println(rb.getString("hello"));
		
		// fazer um arquivo com underline e o novo locale
		// text_en_us.properties
		Locale usa = new Locale("en_us","en_us");
		rb = ResourceBundle.getBundle("aviso",usa);
		
		System.out.println(rb.getString("message") + " " + rb.getString("name"));

	}

}
