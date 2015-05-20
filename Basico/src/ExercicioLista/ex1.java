package ExercicioLista;

/**
 * 
 * @author ivonildo lopes
 * 
 *         0 1 2 3 4 5 10 30 20 50
 * 
 */
public class ex1 {

	private int[] vetor;
	private int quantidade;
	private boolean teste = false;

	ex1(int tamanho) {
		vetor = new int[tamanho];
		quantidade = 0;
	}

	public boolean listaVAZIA() {

		if (quantidade <= 0) {
			System.out.println("O Vetor esta VAZIO");
			return true;
		} else {
			return false;
		}

	}

	public boolean listaCHEIA() {

		if (vetor.length == quantidade) {
			System.out.println("O Vetor esta CHEIO");
			return true;
		} else
			return false;
	}

	public void contaElementos() {

		System.out.println("Quantidade de elementos: " + quantidade);
	}

	public void imprimir() {
		for (int i = 0; i < quantidade; i++) {
			System.out.println(">> " + vetor[i]);
		}
	}

	public void addInicio(int num) {

		if (listaCHEIA())
			;
		else {

			for (int i = quantidade; i > 0; i--) {
				vetor[i] = vetor[i - 1];
			}

			vetor[0] = num;
			quantidade += 1;

		}

	}

	public void addFinal(int num) {

		if (listaCHEIA())
			;
		else {
			vetor[quantidade] = num;

			++quantidade;
		}

	}

	public void addPosicao(int p, int num) {
		if (listaCHEIA())
			;
		else if (p >= quantidade)
			addFinal(num);
		else {

			for (int i = quantidade; i > p; i--) {
				vetor[i] = vetor[i - 1];
			}

			vetor[p] = num;
			quantidade += 1;
		}

	}

	public void removerInicio() {
		if (listaVAZIA())
			;
		else {
			int valorRemovido = vetor[0];

			for (int i = 0; i < quantidade; i++) {
				vetor[i] = vetor[i + 1];
			}

			quantidade -= 1;
		}

	}

	public void removerFinal() {
		if (listaVAZIA())
			;
		else {
			int valorRemovido = vetor[quantidade - 1];

			quantidade -= 1;
		}
	}

	public void removerPosicao(int p) {

		if (listaVAZIA())
			;
		else if (p <= 0)
			removerInicio();
		else {
			int valorRemovido = vetor[p];

			for (int i = p; i < quantidade - 1; i++) {

				vetor[i] = vetor[i + 1];

			}

			quantidade -= 1;
		}

	}

	public boolean organizarLista(String ordem) {

		int temporario;

		if (ordem == ">" || ordem.equals("crescente")) {
			teste = true;
			for (int i = 0; i < quantidade; i++) {
				for (int j = i + 1; j < quantidade; j++) {

					if (vetor[i] > vetor[j]) {

						temporario = vetor[j];
						vetor[j] = vetor[i];
						vetor[i] = temporario;
					}

				}
			}

		} else {
			teste = true;
			for (int i = 0; i < quantidade; i++) {
				for (int j = i + 1; j < quantidade; j++) {

					if (vetor[i] < vetor[j]) {

						temporario = vetor[j];
						vetor[j] = vetor[i];
						vetor[i] = temporario;
					}

				}
			}

		}

		return teste;
	}

	public void verificaOrdemLista() {

		if (teste) {
			if (vetor[0] < vetor[quantidade - 1])
				System.out.println("a lista esta na Ordem crescente");
			else
				System.out.println("a lista esta na Ordem Decrescente");
		}else{
			System.out.println("A lista Não esta na Ordem");
		}
	}


}
