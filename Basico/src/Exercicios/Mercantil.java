package Exercicios;

import java.util.ArrayList;

public class Mercantil {

	ArrayList<Produtos> produtos = new ArrayList<>();

	Produtos p;

	public void addProduto(int codigo, String nome, double preco) {

		p = new Produtos(codigo, nome, preco);
		produtos.add(p);
	}

	public void maisCaro() {

		// System.out.println(produtos.get(0).toString());
		// System.out.println("preco " + produtos.get(0).getPreco());
		double x;
		Produtos y = null;
		for (int i = 0; i <= produtos.size(); i++) {
			for (int j = i + 1; j <= produtos.size() - 1; j++) {
				System.out.println(produtos.get(j).toString());
				if (produtos.get(i).getPreco() > produtos.get(j).getPreco()) {

					y = produtos.get(i);
					// produtos.get(i).setPreco(produtos.get(j).getPreco());
					// produtos.get(j).setPreco(x);
					//
					produtos.set(i, produtos.get(j));
					produtos.set(j, y);
				}
			}

		}
		System.out.println(produtos.get(produtos.size() - 1).toString());
	}

	public void maisBarato() {

		// System.out.println(produtos.get(0).toString());
		// System.out.println("preco " + produtos.get(0).getPreco());
		double x;
		Produtos y = null;
		for (int i = 0; i <= produtos.size(); i++) {
			for (int j = i + 1; j <= produtos.size() - 1; j++) {
				System.out.println(produtos.get(j).toString());
				if (produtos.get(i).getPreco() > produtos.get(j).getPreco()) {

					y = produtos.get(i);
					// produtos.get(i).setPreco(produtos.get(j).getPreco());
					// produtos.get(j).setPreco(x);
					//
					produtos.set(i, produtos.get(j));
					produtos.set(j, y);
				}
			}

		}
		System.out.println(produtos.get(0).toString());
	}

	public static void main(String args[]) {

		Mercantil m = new Mercantil();

		m.addProduto(1, "pc", 1000);
		m.addProduto(2, "carro", 10000);

		m.maisCaro();
		m.maisBarato();
	}

}
