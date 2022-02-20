package aula56_Enum_calculadora;

public class Calculator {

	enum Operaction {

		ADD("+") {
			@Override
			public double executeOperation(double x, double y) {
				return x+y;
				
			}
		}, SUBTRACT("-") {
			@Override
			public double executeOperation(double x, double y) {
				return x - y;
				
			}
		}, MULTIPLY("*") {
			@Override
			public double executeOperation(double x, double y) {
				return x * y;
				
				
			}
		}, DIVIDE("/") {
			@Override
			public double executeOperation(double x, double y) {
				if (y==0) {
					System.out.println("Error. division by zero");
					return 0;
				}
				return x / y;
				
			}
		};

		private String simbol;


		Operaction(String simbol) {
			this.simbol=simbol;
		}


		public String getSimbol() {
			return simbol;
		}
		
		public abstract double executeOperation(double x, double y);
			
		@Override
		public String toString() {
			return this.simbol;
		}
		
		

	}


}
