package Q4;



public class Empregado {

	private String nome, sobrenome;
	private double salarioMensal;

	public Empregado(String nome, String sobrenome, double salarioMensal) {
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salarioMensal = salarioMensal;
	}

	public void exibirSalarioAnual() {
		if (salarioMensal < 0) {
			salarioMensal = 0;
		}
		System.out.println("o funcionario: " + nome + " " + sobrenome + " "
				+ "recebe R$ " + salarioMensal * 12);
	}

	public void aumentoSalario() {
		setSalarioMensal(getSalarioMensal() + (getSalarioMensal() * 0.1));

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
		if (this.salarioMensal < 0) {
			setSalarioMensal(0);
		}

	}

}
