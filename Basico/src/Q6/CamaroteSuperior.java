package Q6;

public class CamaroteSuperior extends Vip implements ImpressaoValor {

	public CamaroteSuperior(double valorAdicional) {
		// TODO Auto-generated constructor stub
		setValorAdicional(valorAdicional);
	}

	public double valorIngressoCamaroteSuperior() {

		return getValorAdicional() + valorIngressoVip();

	}

	public void imprimeValor() {
		System.out.println("o ingresso camarote vip superior eh: R$"
				+ valorIngressoCamaroteSuperior());
	}

}
