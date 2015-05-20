package ExercicioLista;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ex1  e = new ex1(5);
		e.imprimir();
		e.contaElementos();
		
		e.addInicio(10);
		e.imprimir();
		e.contaElementos();
		
		e.addFinal(2);
		e.imprimir();
		e.contaElementos();
		
		e.addInicio(1);
		e.imprimir();
		e.contaElementos();		
		
		e.addFinal(20);
		e.imprimir();
		e.contaElementos();
		e.verificaOrdemLista();
		
//		e.addInicio(5);
//		e.imprimir();
//		e.contaElementos();
		
		e.addPosicao(2, 100);
		e.imprimir();
		e.contaElementos();
		
		e.removerPosicao(3);
		e.imprimir();
		e.contaElementos();
		
		e.removerInicio();
		e.imprimir();
		e.contaElementos();
		
		e.organizarLista("<");
		e.imprimir();
		e.contaElementos();
		e.verificaOrdemLista();
		
		
	}

}
