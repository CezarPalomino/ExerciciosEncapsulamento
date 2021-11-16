package br.com.generation.Exercicio07;

import java.util.Scanner;

public class TestaPaciente {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		Paciente pac = new Paciente();
		
		System.out.println("Qual o nome do paciente?");
		String nome = read.next();
		pac.setNomePaciente(nome);
		System.out.println();
		
		System.out.println("Qual a idade do paciente?");
		int idade = read.nextInt();
		pac.setIdade(idade);
		System.out.println();
		
		System.out.println("Qual o setor em que o paciente se encontra?");
		String setor = read.next();
		pac.setSetor(setor);
		System.out.println();
		
		System.out.println("Qual o status do paciente?");
		String status = read.next();
		pac.setStatus(status);
		
		System.out.println();
		
		System.out.println("Nome: " + pac.getNomePaciente());
		System.out.println("Idade: " + pac.getIdade());
		System.out.println("Setor: " + pac.getSetor());
		System.out.println("Status: " + pac.getStatus());
		
		System.out.println("O paciente pode receber alta?");
		
		if(status.equals("Internado") || status.equals("Grave")) {
			System.out.println("O paciente não pode receber alta!");
		}
		else {
			pac.recebeAlta("Alta Aprovada");
		}
		
		
		read.close();
	}

}
