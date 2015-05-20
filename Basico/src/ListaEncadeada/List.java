package ListaEncadeada;

import java.util.ArrayList;

public class List {

	ArrayList<No> lista;

	List() {
		lista = new ArrayList<>();
		lista.get(0).setValor(50);
	}

	public void listaVazia() {

		if (lista.size() == 0)
			System.out.println("lista Vazia");
	}

	
	public void addInicio(int valor) {

		for (int i = 0; i <= lista.size(); i++) {

			lista.get(i + 1).setValor(i);
			lista.get(i + 1).setAnt(lista.get(i));
			lista.get(i + 1).setProx(lista.get(i));
		}

		lista.get(0).setValor(valor);
		lista.get(0).setAnt(null);
	}

	public void imprime(){
		System.out.println(lista.toString());
	}
}
