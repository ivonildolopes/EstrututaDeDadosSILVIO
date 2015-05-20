public class Conjunto {

	Produto vetor[];

	public Conjunto(Produto... produtos) {
		
		vetor = new Produto[produtos.length];
		for (int i = 0; i < produtos.length; i++) {

			vetor[i] = produtos[i];

		}
	}

	public void removerProduto(int indice) {

		vetor[indice - 1] = null;

	}

	public void listarProdutos() {
		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] != null) {
				vetor[i].imprimeProduto();
			}

		}
	}

}
