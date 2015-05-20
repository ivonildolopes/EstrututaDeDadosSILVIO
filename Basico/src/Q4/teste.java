package Q4;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Empregado um = new Empregado("ivo", "Lopes", -1);
		Empregado dois = new Empregado("caca", "paiva", 100);
		
		um.exibirSalarioAnual();
		um.aumentoSalario();
		um.exibirSalarioAnual();
		
		dois.exibirSalarioAnual();
		dois.aumentoSalario();
		dois.exibirSalarioAnual();
		
		
	}

}
