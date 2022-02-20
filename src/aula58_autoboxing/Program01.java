package aula58_autoboxing;

public class Program01 {

	public static void main(String[] args) {


		System.out.println("Autoboxing");
		System.out.println("Converter tipos primitivos em seu objeto equivalente");
		System.out.println("Unboxing");
		System.out.println("Converter de objetos em tipos primitivos");

		//autoboxing
		Byte byte1 = 17;
		Short short1 = 171;
		Integer int1 = 1712;
		Long long1 = 171282l;
		Float float1 = 3.14f;
		Double double1 = 3.14159265;
		Boolean falso = false;
		Boolean verdadeiro =true;
		Character r ='r';
		
		
		//unboxing
		int int2 = int1;
		int int3 = 12;
		int3 = new Integer(1712);
		
		System.out.println(int1);
		System.out.println(int2);
		System.out.println(int3);
		
		int3++;
		System.out.println(int3);
		System.out.println(int3-13);
		
		//Mau uso de autoxing
		
		Double a, b, c;
		a = 10.3;
		b = 9.5;
		c = 7.3;

		Double sum = (a+b+c);
		System.out.println(sum);
		

	}

}
