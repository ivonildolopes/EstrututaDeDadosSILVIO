package ListaEncadeada;

import ListaEncadeada.*;

public class ListaEncadeada {

	private No inicio_lista;
	private No fim_lista;
	private int quant;
	

	public ListaEncadeada() {
		// TODO Auto-generated constructor stub
		inicio_lista = null;
		fim_lista = null;
		quant= 0;
	}

	public boolean listaVAZIA() {

		if (inicio_lista == null && quant ==0)
			return true;
		else
			return false;
	}

	public void inserirInicio(int e) {
		No novo = new No(e);
		
//		if (!listaVAZIA())
//			novo.setProx(inicio_lista);
//		
//		inicio_lista = novo;
		
		if(listaVAZIA()){
			inicio_lista  = novo;
			fim_lista = inicio_lista;
		}else{
			novo.setProx(inicio_lista);
			inicio_lista = novo;
		}	
		
		quant++;
	}
	
	public void inserirFim(int e){
		No novo = new No(e);
//		No aux;
//		if(listaVAZIA())
//			inicio_lista = novo;
//		else{
//			aux = inicio_lista;
//			
//			while(aux.getProx() != null){
//				aux = aux.getProx();
//			}
//			
//			aux.setProx(novo);
//		}
		
		if(listaVAZIA())
			inserirInicio(e);
		else{
			fim_lista.setProx(novo);
			quant++;
		}
	}
	
	
	public void imprimeALL(){
		
		No aux= inicio_lista;
		int i = 0;
		//while(aux.getProx() !=null){
		while(i < quant){	
			System.out.println(aux.getValor());
			//aux = aux.getProx();
			i++;
		}
	}
	
	public void imprimePrimeiroEUltimo(){
		System.out.println("primeiro: " + inicio_lista + "\n Ultimo: "  + fim_lista);
	}
	
	public void removerInicio(){
		No removido=null;
		
		if(listaVAZIA())
			System.out.println("a lista esta vazia");
		else{
			removido = inicio_lista;
			inicio_lista = inicio_lista.getProx();
		}
	}
	
	public void removerFim(){
		No removido=null;
		
		if(listaVAZIA())
			System.out.println("a lista esta vazia");
		else{
			No aux = inicio_lista;
			removido = aux;
			
			while(removido.getProx() != null){
				aux = removido;
				removido = removido.getProx();
			}
			aux.setProx(null);
		}
	}

}
