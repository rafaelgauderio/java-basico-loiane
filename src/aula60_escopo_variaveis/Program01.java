package aula60_escopo_variaveis;

public class Program01 {

	public static void main(String[] args) {
		
		ScopeVariables scope = new ScopeVariables();
		
		System.out.println(scope.add20(10));
		System.out.println(scope.add2());
		System.out.println(scope.getValue());
		scope.localVariable();
		System.out.println(scope.getValue());
		scope.globalVariable(20);
		scope.parameterValue();
	
		
		
		
		

	}

}
