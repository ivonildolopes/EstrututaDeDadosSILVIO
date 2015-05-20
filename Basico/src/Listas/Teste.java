package Listas;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lista l = new Lista(5);
		
		l.addInicio(50);
		l.quantidadeNalista();
		l.addPosicao(1, 25);
		l.addFinal(45);
		l.quantidadeNalista();
		l.imprimeLista();
		
		l.removerPosicao(1);
		l.quantidadeNalista();
		l.imprimeLista();
		
		l.addPosicao(1, 25);
		l.imprimeLista();
		

	}

}
