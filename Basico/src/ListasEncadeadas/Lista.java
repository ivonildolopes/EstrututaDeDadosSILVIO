package ListasEncadeadas;

public class Lista {
	
	No inicio;
	
	Lista(){
		inicio = null;
	}

	public boolean listaVAZIA(){
		if(inicio==null)
		return true;
		else
			return false;
	}
}
