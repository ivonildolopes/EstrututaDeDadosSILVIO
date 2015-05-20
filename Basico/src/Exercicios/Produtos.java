package Exercicios;

import javax.swing.JOptionPane;

public class Produtos {

	private int codigo;
	private String nome;
	private double preco;

	Produtos(int codigo, String nome, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produtos [codigo=" + codigo + ", nome=" + nome + ", preco="
				+ preco + "]";
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
