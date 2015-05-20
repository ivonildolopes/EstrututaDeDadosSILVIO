public class Produto {

	private int codigo;
	private String descricao;
	private float valor;
	
	
	
	public Produto(int codigo, String descricao, float valor) {

		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public void imprimeProduto(){
		System.out.println("Codigo:" + codigo + "\n" +
							"Descrição: " + descricao + "\n" +
							"Valor: R$ " + valor + "\n");
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

}
