package ListaSequencial;

import java.util.Arrays;

public class Lista {

	private int[] lista;
	private int quantidade;

	Lista(int tamanho) {
		lista = new int[tamanho];
		quantidade = 0;
	}

	public boolean listaVAZIA() {
		if (quantidade == 0)
			return true;
		else
			return false;
	}

	public boolean listaCHEIA() {
		if (quantidade > lista.length)
			return true;
		else
			return false;
	}

	public void quantidadeElementos() {
		System.out.println("A lista contém: " + quantidade + " elementos");
		System.out.println(lista.length);
	}

	public void inserirNaPosicao(int posicao, int valor) {

		if (listaCHEIA())
			System.out.println("a lista esta CHEIA");
		else {
			for (int i = quantidade; i >= posicao; i--) {

				lista[i] = lista[i - 1];
			}
		}

		lista[posicao] = valor;
		quantidade++;
	}

	public void inserirNoFim(int valor) {

		if (listaCHEIA())
			System.out.println(" a lista esta CHEIA");
		else {
			lista[quantidade] = valor;
			quantidade++;
		}
	}

	public void inserirNoInicio(int valor) {
		if (listaVAZIA())
			lista[0] = valor;
		else if (listaCHEIA())
			System.out.println(" a lista esta CHEIA");
		else {
			for (int i = quantidade; i > 0; i--) {
				lista[i] = lista[i - 1];
			}
			lista[0] = valor;

		}
		quantidade++;

	}

	public void removerPosicao(int posicao) {
		if (listaVAZIA())
			System.out.println("lista vazia");
		else {
			for (int i = posicao; i < quantidade-1; i++) {
				lista[i] = lista[i+1];
			}
			quantidade--;
		}
	}
	
	public void removerInicio(){
		if(listaVAZIA())
			System.out.println("lista vazia");
		else{
			for(int i = 0; i < quantidade; i++){
				lista[i] = lista[i+1];
			}
			quantidade--;
		}
	}
	
	
	public void removerFim(){
		quantidade--;
	}

	public void imprimeLista() {
		if (listaVAZIA())
			System.out.println("lista vazia");
		else if (listaCHEIA())
			System.out.println("lista Cheia");

		else {
			for (int i = 0; i <= quantidade - 1; i++)
				System.out.println(i + ">> " + lista[i]);

		}
	}

}
