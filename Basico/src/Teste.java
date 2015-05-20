
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Produto p1 = new Produto(110,"One Milion", 700);
		Produto p2 = new Produto(111,"Ferrari Black", 400);
		Produto p3 = new Produto(112,"CK One", 300);
		Produto p4 = new Produto(113,"Animalle", 200);
		
		p2.imprimeProduto();
		
		Conjunto c = new Conjunto(p1,p2,p3,p4);
		
		c.removerProduto(2);
		c.listarProdutos();
		
	}

}
