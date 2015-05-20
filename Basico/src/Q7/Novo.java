package Q7;

public class Novo extends Imovel {
	
	private double adicional;

	public void imprimeValorAdicional(){
		System.out.println("o valor adicional eh: R$ "+ getAdicional());
	}
	
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	

}
