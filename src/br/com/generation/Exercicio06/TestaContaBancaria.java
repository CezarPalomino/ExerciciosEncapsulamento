package br.com.generation.Exercicio06;

import java.util.Scanner;

public class TestaContaBancaria {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		ContaBancaria conta = new ContaBancaria();
		
		System.out.println("Digite seu nome: ");
		String nome = read.next();
		conta.setNome(nome);
		System.out.println();
		
		System.out.println("Digite seu ID: ");
		String id = read.next();
		conta.setIdCliente(id);
		System.out.println();
		
		System.out.println("Digite sua agência: ");
		int agencia = read.nextInt();
		conta.setAgencia(agencia);
		System.out.println();
		
		System.out.println("Digite o número da conta: ");
		int numeroConta = read.nextInt();
		conta.setNumeroConta(numeroConta);
		System.out.println();

		System.out.println("Saldo total: R$" + conta.getSaldo());
		System.out.println();
		
		System.out.println("Digite o valor do boleto a ser pago: ");
		double valorBoleto = read.nextDouble();
		System.out.println();
		
		conta.pagarBoleto(valorBoleto);
		
		System.out.println("Pagamento efetuado com sucesso! Saldo atual: R$" + conta.getSaldo());
		
		read.close();
	}

}
