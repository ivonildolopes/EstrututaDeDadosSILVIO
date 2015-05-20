package Q7;

public class Velho extends Imovel {
	
	private double desconto;

	
	public void imprimeDesconto(){
		
		System.out.println("o desconto eh: R$" + getDesconto());
	}
	
	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	

}
