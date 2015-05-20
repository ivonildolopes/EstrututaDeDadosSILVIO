package Prova;

import java.util.ArrayList;

public class Q2 {

	ArrayList<No> Lista = new ArrayList<>();
	No inicio;

	public int contaElementos() {

		if(inicio == null) return 0;
		
		No aux = inicio;
		int cont = 0;
		
		while (aux.getProx() != inicio) {
			cont++;
			aux = aux.getProx();
		}

		return cont++;
	}
	
	
	public void addInicio(int valor){
		No fim;
		
		No novo = new No();
	}

}
