package br.com.generation.Exercicio01;

import java.util.Scanner;

public class TestaCliente {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		Cliente cliente = new Cliente();
		
		System.out.println("Digite o primeiro nome do Cliente: ");
		String nome = read.next();
		cliente.setNome(nome);
		
		System.out.println("Digite a idade do Cliente: ");
		int idade = read.nextInt();
		cliente.setIdade(idade);
		
		System.out.println("Digite o gênero do Cliente: ");
		String genero = read.next();
		cliente.setGenero(genero);
		
		System.out.println("Digite o ID do Cliente: ");
		String id = read.next();
		cliente.setId(id);
		
		System.out.println();
		
		System.out.println("| Nome do Cliente: " + cliente.getNome() + "|");
		System.out.println("| Idade do Cliente: " + cliente.getIdade() + "|");
		System.out.println("| Gênero do Cliente: " + cliente.getGenero() + "|");
		System.out.println("| ID do Cliente: " + cliente.getId() + "|");
		cliente.compra(50);
		System.out.println("Cliente compra calça no valor de 50 reais. Dinheiro atual: R$" + cliente.getDinheiro());
		read.close();
	}

}
