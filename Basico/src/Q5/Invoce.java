package Q5;

public class Invoce {

	private int numItem, quantidade;
	private String item;
	private double preco;

	public Invoce(int numItem, int quantidade, String item, double preco) {
		super();
		this.numItem = numItem;
		this.quantidade = quantidade;
		this.item = item;
		this.preco = preco;

		if (getQuantidade() < 0)
			setQuantidade(0);

		if (getPreco() < 0)
			setPreco(0);
	}

	public double getInvoceAmount() {

		return getQuantidade() * preco;
	}

	public void imprimeFatura() {
		System.out
				.println("Codigo do item \t  Quantidade \t Item \t\t Preço Unitario");
		System.out.println("_____________________________________________________________ \n");
		
		System.out.println(getnumItem() + "\t\t\t" + getQuantidade() + "x \t"
				+ getItem() + " \t\t R$" + getPreco() + " \n");
		
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println("\t\t\t\t\t TOTAL: R$ " + getInvoceAmount());
		
	}

	public int getnumItem() {
		return numItem;
	}

	public void setnumItem(int numItem) {
		this.numItem = numItem;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
