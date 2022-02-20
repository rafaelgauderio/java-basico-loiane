package aula56_Enum_calculadora;

import java.text.DecimalFormat;

import aula56_Enum_calculadora.Calculator.Operaction;

public class Program01 {

	public static void main(String[] args) {

		double x =93.7;
		double y =42.3;

		DecimalFormat fmt = new DecimalFormat("0.00");

		Operaction add = Calculator.Operaction.ADD;
		Operaction sub = Calculator.Operaction.SUBTRACT;
		Operaction mult = Calculator.Operaction.MULTIPLY;
		Operaction div = Calculator.Operaction.DIVIDE;

		System.out.println(x + " " + add.toString() + " " + y + " = " + fmt.format(add.executeOperation(x, y)));
		System.out.println(x  + " " + sub.toString() + " " + y + " = " + fmt.format(sub.executeOperation(x, y)));
		System.out.println(x  + " " + mult.toString() + " " + y + " = " + fmt.format(mult.executeOperation(x, y)));
		System.out.println(x  + " " + div.toString() + " " + y + " = " + fmt.format(div.executeOperation(x, y)));

		System.out.println("\nUsing values\n");
		
		for(Calculator.Operaction op : Calculator.Operaction.values()) {
			
			System.out.println(x + " " + op.toString() + " " + y +  " = " + fmt.format(op.executeOperation(x, y)));
			
			
		}




	}

}
