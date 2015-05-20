package ListaSequencial;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lista l = new Lista(5);
 
		
		l.inserirNoInicio(10);
		l.inserirNoFim(50);
		l.inserirNaPosicao(1, 30);
		l.inserirNaPosicao(2, 40);
		l.inserirNaPosicao(1, 20);
		
		l.removerPosicao(3);
		l.removerPosicao(1);
		l.removerFim();
		l.removerInicio();
		l.imprimeLista();
		
	}

}
