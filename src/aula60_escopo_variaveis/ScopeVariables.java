package aula60_escopo_variaveis;

public class ScopeVariables {

	private int value;

	public ScopeVariables() {


	}

	public ScopeVariables(int value) {

		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int add20(int value) {

		value = value + 20;

		return value;

	}

	public int add2() {
		int value = 10;
		value=value+2;
		return value;

	}

	public void addUsingForLoop() {

		for (int i=0; i<15; i++){
			System.out.println(i);
		}
		//só posso usar a variavel i dentro do escopo do if


		int j;
		for (j=0; j<15; j++){
			System.out.println(j);
		}

		System.out.println(j);
		//posso usar o j fora do escopo do for

	}

	public void localVariable() {

		boolean flag = true;

		if(flag==true) {
			int local = 10;
			local=local+2;
			System.out.println(local);
		}

		//System.out.println(local);
		//erro de compilação

	}

	public void globalVariable(int value){

		int global=0;

		try {
			int number = 2;

			global = value/number;
			System.out.println(global);

		} catch (Exception error){
			error.printStackTrace();
		} finally {
			global++;
			//number não pode ser chamado aqui
			//error não pertence a esse escopo
		}

		value++;

		//number++; //erro de compilação
		//erro.printStackTrace(); //erro de compilação
	}
	
	public void parameterValue() {
		this.value=30;
		this.value= this.value + 10;
		System.out.println(value);
	}




}
