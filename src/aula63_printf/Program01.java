package aula63_printf;

public class Program01 {
	
	public static void main (String  [] args) {
		
		System.out.format("System.out.printf é apenas um atalho para o System.out.format%n");
		System.out.format("System.out.printf(formato-da-string,[args1],args[2],[agrs3]%n");
		System.out.println("%[flags][largura][.casas_decimais]caracter-de-conversão\n");
		
		
		String name = "Rafael de Luca";
		//string //%n para pular linha, letra maiscula para alterar para CAPS LOOK
		System.out.printf("%s",name);
		System.out.printf("%n");
		System.out.printf("%S",name);
		
		//caracter
		System.out.printf("%n%c",'a');
		System.out.printf("%n%C",'a');
		
		int value = 17121995;
		System.out.printf("%n%d",value);
		
		float value2=82.727272f;
		System.out.printf("%n%f",value2);
		
		//limitando o número de caracteres e alinhando a esquerda
		System.out.printf("%n%25s",name);
		System.out.printf("%n%-25s",name);
		
		int pos = 17;
		int neg = -14;
		//numero negativo ou positivo com sinal
		System.out.printf("%n%+d",pos);
		System.out.printf("%n%+d",neg);
		
		//15 digitos completados com zeros a esquerda e arredondamento de 2 casas
		double double1 = 1712.92983834774;
		System.out.printf("%n%015.2f",double1);
		System.out.printf("%n%015d",value);
		
		
		
		//separando milhares com virgula ou ponto. Brasil virgula e USA ponto
		System.out.printf("%n%,d",value);
		System.out.printf("%n%,f",value2);
		
		//deixando um espaço imprime o sinal do numero
		System.out.printf("%nnúmero com sinal: " + "% d",neg);
		System.out.printf("%nnúmero com sinal: " + "% d",pos);	
		
		
		System.out.printf("%n3 casas decimais: "+ "%.3f",double1);
		//completa com 8 espaços e duas casas decimais
		System.out.printf("%nR$%8.2f",double1);		
		
		System.out.printf("%n%n");
		printPrice();
		
		
	}
	
	
	public static void printPrice() {
		
		double [] prices = {2000, 45.90 ,  12.99, 4.94949494, 500.1};
		
		//imprimindo com duas casas e 12 espaços no preço
		for(int item=0; item <prices.length; item++) {
			
			System.out.printf("%s %02d: preço final de R$%,12.2f%n","Item",item+1, prices[item]);
			
		}
		
	}

	
}
