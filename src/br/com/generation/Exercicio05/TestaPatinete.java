package br.com.generation.Exercicio05;

import java.util.Scanner;

public class TestaPatinete {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		Patinete patin = new Patinete();
		
		System.out.println("Qual o preço do patinete? ");
		double preco = read.nextDouble();
		patin.setPreco(preco);
		System.out.println();
		
		System.out.println("Qual a cor do patinete? ");
		String cor = read.next();
		patin.setCor(cor);
		System.out.println();
		
		System.out.println("Qual o lote do patinete? ");
		String lote = read.next();
		patin.setLote(lote);
		System.out.println();
		
		System.out.println("Qual o tamanho do patinete em cm? ");
		double tamanhoCm = read.nextDouble();
		patin.setTamanhoCm(tamanhoCm);
		System.out.println();
		
		System.out.println("Patinetes desse modelo em estoque: ");
		int quantidadeEstoque = read.nextInt();
		patin.setQuantidadeEstoque(quantidadeEstoque);
		System.out.println();
		
		System.out.println("Preço: R$" + patin.getPreco());
		System.out.println("Cor: " + patin.getCor());
		System.out.println("Lote: " + patin.getLote());
		System.out.println("Tamanho: " + patin.getTamanhoCm() + "cm");
		System.out.println("Quantidade em estoque antes da compra: " + patin.getQuantidadeEstoque());
		System.out.println();
		
		System.out.println("Quantidade de produtos que deseja comprar: ");
		int quantidadeComprada = read.nextInt();
		patin.compraPatinete(quantidadeComprada);
		System.out.println();
		
		System.out.println("Quantidade de produtos em estoque após a compra: " + patin.getQuantidadeEstoque());
		
		read.close();
	}
	
}
