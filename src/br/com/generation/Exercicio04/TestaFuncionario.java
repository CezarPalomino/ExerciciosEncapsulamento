package br.com.generation.Exercicio04;

import java.util.Scanner;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		 
		System.out.println("Nome do funcionário: ");
		String nome = read.next();
		funcionario.setNome(nome);
		
		System.out.println();
		
		System.out.println("Setor do funcionário: ");
		String setor = read.next();
		funcionario.setSetor(setor);
		
		System.out.println();
		
		System.out.println("Meta de itens vendidos: ");
		int meta = read.nextInt();
		funcionario.setMeta(meta);
		
		System.out.println();
		
		System.out.println("Salário do funcionário: ");
		double salario = read.nextDouble();
		funcionario.setSalario(salario);
	
		System.out.println();
		
		System.out.println("Horas Extra do funcionário: ");
		double horaExtra = read.nextDouble();
		funcionario.setHoraExtra(horaExtra);
		
		System.out.println();
		
		funcionario.fazendoHoraExtra(horaExtra);
		
		
		System.out.println("Funcionário: " + funcionario.getNome());
		System.out.println("Setor: " + funcionario.getSetor());
		System.out.println("Meta de vendas: " + funcionario.getMeta());
		System.out.println("Salário do funcionário: " + funcionario.getSalario());
		System.out.println("Salário: " + funcionario.getSalarioExtra());
		
		read.close();
	}

}
