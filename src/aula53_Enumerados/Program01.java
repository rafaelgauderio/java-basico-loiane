package aula53_Enumerados;

public class Program01 {

	public static void main(String[] args) {
		
		System.out.println("ENUM\n"
				+ "Enums extends a classe java.lang.Enum;\n"
				+ "Enum n�o pode ser instanciado com new();\n"
				+ "Podem implementar interfaces;\n"
				+ "N�o tem heran�a multipla, j� herdam(extends) da classe java.lang;\n"
				+ "Podem ser declaros dentro de uma classe ou como classe avulsa.");
		
		System.out.println("Mais elegante e organizado trabalhar com ENUM do que com constante."
				+ "\nMaior controle da limita��o das op��es de valores do que deixar livre para qualquer constante.\n");

		usingConstants();
		System.out.println();
		usingEnumerated();

	}

	public static void usingConstants() {
		int janeiro = MesAnoConstantes.JANEIRO;
		int fevereiro = MesAnoConstantes.FEVEREIRO;
		int marco = MesAnoConstantes.MARCO;
		int abril = MesAnoConstantes.ABRIL;
		int maio = MesAnoConstantes.MAIO;
		int junho = MesAnoConstantes.JUNHO;
		int julho = MesAnoConstantes.JULHO;
		int agosto = MesAnoConstantes.AGOSTO;
		int setembro = MesAnoConstantes.SETEMBRO;
		int outubro = MesAnoConstantes.OUTUBRO;
		int novembro = MesAnoConstantes.NOVEMBRO;
		int dezembro = MesAnoConstantes.DEZEMBRO;	

		System.out.println("TEST USING CONSTANTS");
		printYearMonth(janeiro);
		printYearMonth(fevereiro);
		printYearMonth(marco);
		printYearMonth(abril);
		printYearMonth(maio);
		printYearMonth(junho);
		printYearMonth(julho);
		printYearMonth(agosto);
		printYearMonth(setembro);
		printYearMonth(outubro);
		printYearMonth(novembro);
		printYearMonth(dezembro);


	}

	public static void usingEnumerated() {

		MesAno janeiro = MesAno.JANEIRO;
		MesAno fevereiro = MesAno.FEVEREIRO;
		MesAno marco = MesAno.MARCO;
		MesAno abril = MesAno.ABRIL;
		MesAno maio = MesAno.MAIO;
		MesAno junho = MesAno.JUNHO;
		MesAno julho = MesAno.JULHO;
		MesAno agosto = MesAno.AGOSTO;
		MesAno setembro = MesAno.SETEMBRO;
		MesAno outubro = MesAno.OUTUBRO;
		MesAno novembro = MesAno.NOVEMBRO;
		MesAno dezembro = MesAno.DEZEMBRO;	

		System.out.println("TEST USING ENUMERATED");
		printYearMonth(janeiro);
		printYearMonth(fevereiro);
		printYearMonth(marco);
		printYearMonth(abril);
		printYearMonth(maio);
		printYearMonth(junho);
		printYearMonth(julho);
		printYearMonth(agosto);
		printYearMonth(setembro);
		printYearMonth(outubro);
		printYearMonth(novembro);
		printYearMonth(dezembro);


	}

	public static void printYearMonth(int month) {

		switch (month) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break;
		case 7:
			System.out.println("Julho");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
		case 12:
			System.out.println("Dezembro");
			break;		

		}
	}
	//USANDO ENUMERADOS
	public static void printYearMonth(MesAno month) {

		switch (month) {
		case JANEIRO:
			System.out.println("Janeiro");
			break;
		case FEVEREIRO:
			System.out.println("Fevereiro");
			break;
		case MARCO:
			System.out.println("Marco");
			break;
		case ABRIL:
			System.out.println("Abril");
			break;
		case MAIO:
			System.out.println("Maio");
			break;
		case JUNHO:
			System.out.println("Junho");
			break;
		case JULHO:
			System.out.println("Julho");
			break;
		case AGOSTO:
			System.out.println("Agosto");
			break;
		case SETEMBRO:
			System.out.println("Setembro");
			break;
		case OUTUBRO:
			System.out.println("Outubro");
			break;
		case NOVEMBRO:
			System.out.println("Novembro");
			break;
		case DEZEMBRO:
			System.out.println("Dezembro");
			break;		

		}



	}

}
