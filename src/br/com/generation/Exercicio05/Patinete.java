package br.com.generation.Exercicio05;

public class Patinete {

	
	private double preco;
	private String cor;
	private String lote;
	private double tamanhoCm;
	private int quantidadeEstoque;
	
	public int compraPatinete(int quantidadeComprada) {
		return quantidadeEstoque += - quantidadeComprada;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public double getTamanhoCm() {
		return tamanhoCm;
	}

	public void setTamanhoCm(double tamanhoCm) {
		this.tamanhoCm = tamanhoCm;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
}
