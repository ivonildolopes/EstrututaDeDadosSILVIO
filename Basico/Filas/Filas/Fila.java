package Filas;

import java.util.Arrays;

public class Fila {

	private int quantidade;

	int[] fila;

	Fila(int tamanho) {

		fila = new int[tamanho];
		quantidade = 0;
	}

	public boolean filaVAZIA() {

		if (quantidade <= 0)
			return true;
		else
			return false;
	}

	public boolean filaCHEIA() {

		if (quantidade >= fila.length)
			return true;
		else
			return false;
	}

	public void inserir(int valor) {
		
		if(filaCHEIA())
			System.out.println("Fila lotada");
		else{
		fila[quantidade] = valor;
		quantidade += 1;
		}
	}

	public void remover() {

		for (int i = 0; i < quantidade - 1; i++) {
			fila[i] = fila[i + 1];
		}
		quantidade--;

	}

	public void imprimeFila() {
		if (filaVAZIA())
			System.out.println("A fila esta vazia");
		else {
			for (int i = 0; i < quantidade; i++) {
				System.out.println(i + " >> " + fila[i]);
			}
		}
	}

}
