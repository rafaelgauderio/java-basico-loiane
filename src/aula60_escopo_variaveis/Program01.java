package aula60_escopo_variaveis;

public class Program01 {

	public static void main(String[] args) {
		
		ScopeVariables scope = new ScopeVariables();
		
		//alterando argumento da função value e variável local value
		System.out.println(scope.add20(10));
		System.out.println(scope.add2());
		System.out.println(scope.getValue());
		scope.localVariable();
		System.out.println(scope.getValue());
		scope.globalVariable(20);
		
		System.out.println();
		
		//alterando o parametro da classe value
		scope.parameterValue();	
		System.out.println(scope.getValue());
		scope.setValue(250);
		System.out.println(scope.getValue());	
		
		

	}

}
