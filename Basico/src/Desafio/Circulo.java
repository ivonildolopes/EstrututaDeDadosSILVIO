package Desafio;

public class Circulo extends Forma {

	private float raio;
	

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	@Override
	float calcularArea() {

		return (float) Math.pow(Math.PI * raio, 2);
	}

	@Override
	float calcularPerimetro() {

		return (float) (2 * Math.PI * raio);
	}

}
