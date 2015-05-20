package Desafio;

public class Retangulo extends Forma {

	private float lado, altura;

	@Override
	public float calcularArea() {

		return lado * altura;
	}

	@Override
	public float calcularPerimetro() {
		// TODO Auto-generated method stub
		return lado * 2 + altura *2;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

}
