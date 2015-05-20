package Q6;

public class Ingresso implements ImpressaoValor {

	private double valor;

	public void imprimeValor(){
		
		System.out.println("O valor do Ingresso eh: R$ " + getValor());
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
