package Desafio;

public class Quadrado extends Retangulo {
		
	
	
	
	@Override
	public void setLado(float lado) {
		// TODO Auto-generated method stub
		super.setLado(lado);
		super.setAltura(getLado());
	}
	


}
