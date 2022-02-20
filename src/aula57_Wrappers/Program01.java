package aula57_Wrappers;

public class Program01 {
	
	
	public static void main(String [] args) {
		
		//extends da classe Number
		byte byte1 = 17;
		short short1 = 171;
		int int1 = 1712;
		long long1 = 171282l;
		float float1 = 3.14f;
		double double1 = 3.14159265;
		
		//extends da classe Object
		boolean falso = false;
		boolean verdadeiro =true;
		char a ='a';
		
		System.out.println(String.format("%.1f", float1));
		System.out.println(String.format("%.3f", double1));
		
		@SuppressWarnings("deprecation")
		Short short2 = new Short((short) 17);
		Byte byte2 = new Byte((byte) 171);
		Integer int2 = new Integer(1712);
		Long long2 = new Long(171281l);
		Float float2 = new Float(float1);
		Double double2 = new Double(3.14159265);
		
		System.out.println(float2);
		System.out.println(double2);		
		
		System.out.println("Converter para inteiro: " + float2.intValue());
		System.out.println("Converter para Short: " + float2.shortValue());
		
		
		//Converter String para Double, para dar exceção por erro de conversão
		double double3 = Double.parseDouble("50.2933665");
		System.out.println(String.format("%.2f", double3));
		
		
		Integer int3 = Integer.valueOf("4523");
		int int4 = 4523;
		Integer int5 = new Integer(4523);
		String int6 = String.valueOf(4523);
		
		System.out.println(int4==int3);
		System.out.println(int4==int5);
		System.out.println(int3==int5);
		System.out.println(int6.equals(int5));
		System.out.println(int6.equals(int4));
		System.out.println(int6.equals(int3));
		
		System.out.println(int3);
		System.out.println(int4);
		System.out.println(int5);
		System.out.println(int6);
		
		
		
		
		
		
		
	}
	

}
