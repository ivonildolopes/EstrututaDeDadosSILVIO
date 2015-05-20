package Desafio;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Quadrado q = new Quadrado();
		
		q.setLado(2);
		
		
		System.out.println("area do quadrado: " + q.calcularArea());
		
		System.out.println("perimetro do quadrado: "+ q.calcularPerimetro());
		
		
		
		System.out.println("\n\n");
		Retangulo r = new Retangulo();
		
		r.setAltura(3);
		
		r.setLado(2);
		
		System.out.println("area do retangulo: " + r.calcularArea());
		
		System.out.println("perimetro do retangulo: "+ r.calcularPerimetro());
		
		
		System.out.println("\n\n");
		
		FormataResultado f = new FormataResultado();
		
		f.recebeFormato(q);
		
			
	}

}
