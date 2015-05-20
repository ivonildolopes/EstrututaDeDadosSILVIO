package Exercicios;

public class Fatorial {

//	public void calculaFatorial(int num) {
//		int n=num;
//		int i = num - 1;
//		while (i >= 1) {
//			num = num * i;
//			i--;
//
//		}
//
//		System.out.println("fatorial de "+n+"! : "+num);
//	}
	
	//recursividade
	public int fatorial(int n){
		
		if(n==1)
			return 1;
		return  n * fatorial(n -1);
		
	}
	
	public void imprimeFatorial(int n){
		
		System.out.println("fatorial ( "+ n + " ): " + fatorial(n));
		
	}

	public static void main(String args[]) {

		Fatorial f = new Fatorial();
		f.imprimeFatorial(4);

		

	}
	
	

}
