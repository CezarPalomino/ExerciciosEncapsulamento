package br.com.generation.Exercicio04;

import java.util.Scanner;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		 
		System.out.println("Nome do funcion�rio: ");
		String nome = read.next();
		funcionario.setNome(nome);
		
		System.out.println();
		
		System.out.println("Setor do funcion�rio: ");
		String setor = read.next();
		funcionario.setSetor(setor);
		
		System.out.println();
		
		System.out.println("Meta de itens vendidos: ");
		int meta = read.nextInt();
		funcionario.setMeta(meta);
		
		System.out.println();
		
		System.out.println("Sal�rio do funcion�rio: ");
		double salario = read.nextDouble();
		funcionario.setSalario(salario);
	
		System.out.println();
		
		System.out.println("Horas Extra do funcion�rio: ");
		double horaExtra = read.nextDouble();
		funcionario.setHoraExtra(horaExtra);
		
		System.out.println();
		
		funcionario.fazendoHoraExtra(horaExtra);
		
		
		System.out.println("Funcion�rio: " + funcionario.getNome());
		System.out.println("Setor: " + funcionario.getSetor());
		System.out.println("Meta de vendas: " + funcionario.getMeta());
		System.out.println("Sal�rio do funcion�rio: " + funcionario.getSalario());
		System.out.println("Sal�rio: " + funcionario.getSalarioExtra());
		
		read.close();
	}

}
