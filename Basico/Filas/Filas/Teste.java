package Filas;

public class Teste {

	public static void main(String[] args) {

		Fila f = new Fila(4);

		f.imprimeFila();

		f.inserir(10);

		f.imprimeFila();
		System.out.println("");
		f.inserir(20);

		f.imprimeFila();
		System.out.println("");
		f.inserir(30);

		f.imprimeFila();
		System.out.println("");
		f.inserir(40);

		f.imprimeFila();
		System.out.println("");
		
		f.remover();
		f.imprimeFila();
	}

}
