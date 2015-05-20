package Q6;

public class Teste {

	public static void main(String args[]) {

		CamaroteSuperior c = new CamaroteSuperior(50);
		c.setValor(100);
		c.setValorAdicional(50);
		c.imprimeValor();

		Vip v = new Vip();
		v.setValor(100);
		v.setValorAdicional(50);
		v.imprimeValor();

		Ingresso i = new Ingresso();
		i.setValor(100);
		i.imprimeValor();
	}
}
