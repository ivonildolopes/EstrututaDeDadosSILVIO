package Q6;

public class CamaroteInferior extends Vip {

	
	private String localizacao;

	public void imprimeLocalizacao(){
		
		System.out.println("a localizacao eh: "+ getLocalizacao());
	}
	
	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	
}
