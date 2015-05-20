package Encadeada;

import java.util.ArrayList;

public class FilaEncadeadaSimples {

	No inicio=null;
	No auxiliar = inicio;

	public boolean filaVAZIA() {
		if (inicio==null)
			return true;
		else
			return false;
	}

	public void inserir(int valor) {
		No novo = new No();
		if(filaVAZIA())
			inicio = novo;
	
    //inicio _,__ ____
		//  |_10_|_20_|
		
		while (auxiliar.getProximo() != null) {
			auxiliar = auxiliar.getProximo();
		}
		auxiliar.setProximo(novo);
		novo.setValor(valor);
		
	}
	
	public void remover(){
		inicio = inicio.getProximo();
		
	}

}
