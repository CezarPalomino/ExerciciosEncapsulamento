package br.com.generation.Exercicio03;

import java.util.Scanner;

public class TestaProdutoEletronico {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		ProdutoEletronico produto = new ProdutoEletronico();
		
		System.out.println("Digite o nome do produto: ");
		String nome = read.next();
		produto.setProduto(nome);
		
		System.out.println("Digite o lote do produto: ");
		String lote = read.next();
		produto.setLote(lote);
		
		System.out.println("Digite a tensão de atuação do produto: ");
		String tensao = read.next();
		produto.setTensao(tensao);
		
		System.out.println("Digite a quantidade de produtos semelhantes em estoque: ");
		int quantidade = read.nextInt();
		produto.setQuantidade(quantidade);
		
		System.out.println("Quantidade do mesmo produto comprado: ");
		int quantos = read.nextInt();
		
		System.out.println("Produto: " + produto.getProduto());
		System.out.println("Lote: " + produto.getLote());
		System.out.println("Tensão: " + produto.getTensao());
		System.out.println("Produtos semelhante em estoque: " + produto.getQuantidade());
		
		System.out.println();
		
		
		produto.comprarItem(quantos);
		
		System.out.println("Produtos em estoque após a venda: " + produto.getQuantidade());
		
		read.close();
	}

}
