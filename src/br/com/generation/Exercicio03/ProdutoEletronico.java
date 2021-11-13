package br.com.generation.Exercicio03;

public class ProdutoEletronico {

	private String produto;
	private String lote;
	private String tensao;
	private int quantidade;
	
	void comprarItem(int quantos) {
		quantidade += - quantos;
	}
	
	
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getTensao() {
		return tensao;
	}

	public void setTensao(String tensao) {
		this.tensao = tensao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}	
}
