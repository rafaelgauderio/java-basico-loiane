package aula65_annotations;

public @interface InfoSite {
	
	String author() default "Rafael de Luca";
	String site() default "https://delucahigiene.com.br";

}
