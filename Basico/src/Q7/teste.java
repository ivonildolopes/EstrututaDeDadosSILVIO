package Q7;

public class teste {

	public void imprimeImovel(int i){
		
		if(i==1){
			Novo n = new Novo();
			n.imprimeValorAdicional();
		}else if(i==0){
			Velho v = new Velho();
			v.imprimeDesconto();
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
