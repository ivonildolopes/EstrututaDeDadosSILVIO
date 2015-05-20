package Listas;


public class Lista {

	int vetorElementos[];
	int quantidade;

	Lista(int t) {
		vetorElementos = new int[t];
		quantidade = 0;

	}

	public void imprimeLista() {
		for (int i = 0; i < quantidade; i++) {
			System.out.println(" - " +vetorElementos[i]);
		}
	}

	public boolean listaVazia() {
		if (quantidade == 0)
			return true;
		else
			return false;

	}

	public boolean listaCheia() {

		if (quantidade >= vetorElementos.length - 1)
			return true;
		else
			return false;

	}
	
	public void quantidadeNalista(){
		System.out.println("Quantidade de elementos na lista: "+ quantidade);
	}

	public void addFinal(int e) {
		if (listaCheia())
			System.out.println("Estrutura cheia");
		else {
			int indice = quantidade;

			vetorElementos[indice] = e;

			quantidade += 1;
		}

	}

	public void removerFinal() {
		if (listaVazia())
			System.out.println("estrutura vazia");
		else {
			int indice = quantidade - 1;
			int elementoRemovido = vetorElementos[indice];
			quantidade = indice;

			System.out.println(elementoRemovido);

		}
	}

	public void addInicio(int e) {
		if (listaCheia())
			System.out.println("Estrutura cheia");
		else {
			for (int i = quantidade; i > 0; i--) {
				vetorElementos[i] = vetorElementos[i - 1];
			}
			vetorElementos[0] = e;
			quantidade += 1;
		}

	}

	public void removerInicio() {
		if (listaVazia())
			System.out.println("Estrutura vazia");
		else {
			int elementoRemovido = vetorElementos[0];

			for (int i = 1; i <= quantidade; i++) {
				vetorElementos[i - 1] = vetorElementos[i];
			}

			quantidade -= 1;
			System.out.println(elementoRemovido);
		}

	}

	public void addPosicao(int i, int e) {

		
		if (listaCheia())
			System.out.println("Estrutura Cheia");
		else if(i<=0)
			addInicio(e);
		if (i >= quantidade)
			addFinal(e);
		else {

			for (int indice = quantidade; indice > i; indice--) {
				vetorElementos[indice] = vetorElementos[indice - 1];
			}
			vetorElementos[i] = e;
			quantidade += 1;

		}

	}
	
	public void removerPosicao(int i){
		if(listaVazia())
			System.out.println("Estrutura Vazia");
		else if(i<=0)
			removerInicio();
		else if(i>= quantidade)
			removerFinal();
		else{	
			
			int elementoRemovido = vetorElementos[i];
			
			for(int indice = i; i <= quantidade; i++){
				vetorElementos[indice] = vetorElementos[indice+1];
			}
			
			quantidade -=1;
			
			System.out.println("elemento removido foi: "+elementoRemovido);
		}
		
	}

}
