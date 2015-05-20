package Q6;

public class Vip extends Ingresso implements ImpressaoValor {

	private double valorAdicional;

	public double valorIngressoVip() {

		return getValor() + getValorAdicional();
	}

	public void imprimeValor() {
		System.out.println("o ingresso Vip eh: R$" + valorIngressoVip());
	}

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

}
