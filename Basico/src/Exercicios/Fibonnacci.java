package Exercicios;

public class Fibonnacci {

	int prox = 0, ant = 1, atual = 1;

	public int calcularFibonnacci(int num) {

		// System.out.println(ant + "\n" + atual);
		//
		// int i = 1;
		// while (i <= num) {
		// prox = atual + ant;
		// ant = atual;
		// atual = prox;
		// i++;
		//
		// System.out.println("" + atual);
		// }

		if (num == 1)
			return 1;

		prox = atual + ant;
		ant = atual;
		atual = prox;
//
		System.out.println(" " + atual);
		
		//return calcularFibonnacci(num - 2) + calcularFibonnacci(num-1);
		return calcularFibonnacci(num-1);

	}
	
	public void imprimeFibonacci(int num){
		System.out.println(" "+calcularFibonnacci(num));
		
	}

	public static void main(String args[]) {
		Fibonnacci f = new Fibonnacci();
		System.out.println(f.ant + "\n" + f.atual);
		f.imprimeFibonacci(4);
	}
}
