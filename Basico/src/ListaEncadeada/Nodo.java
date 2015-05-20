package ListaEncadeada;

/**
 * @author ivonildo lopes
 *
 */
public class Nodo {
	
	private int valor;
	
	private No prox,ant;

	public Nodo(int e) {
		// TODO Auto-generated constructor stub
	}




	public int getValor() {
		return valor;
	}
	
	
	

	public void setValor(int valor) {
		this.valor = valor;
	}

	public No getProx() {
		return prox;
	}

	public void setProx(No prox) {
		this.prox = prox;
	}

	public No getAnt() {
		return ant;
	}

	public void setAnt(No ant) {
		this.ant = ant;
	}




	@Override
	public String toString() {
		return "No [valor=" + valor + ", prox=" + prox + ", ant=" + ant + "]";
	}
	
	

}
