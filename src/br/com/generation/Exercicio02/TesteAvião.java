package br.com.generation.Exercicio02;

import java.util.Scanner;

public class TesteAvi�o {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		Avi�o aviao = new Avi�o();
		
		System.out.println("Tipo de motor: ");
		String tipoDeMotor = read.next();
		aviao.setTipoDeMotor(tipoDeMotor);
		
		System.out.println("Cor do avi�o: ");
		String cor = read.next();
		aviao.setCor(cor);
		
		System.out.println("Tamanho do avi�o: ");
		int tamanhoMetros = read.nextInt();
		aviao.setTamanhoMetros(tamanhoMetros);
		
		System.out.println("Tipo de motor: " + aviao.getTipoDeMotor());
		System.out.println("Cor do avi�o: " + aviao.getCor());
		System.out.println("Tamanho em metros do avi�o: " + aviao.getTamanhoMetros() + " metros");
		aviao.acelerar(20);
		System.out.println("Velocidade m�xima do avi�o: " + aviao.getVelocidadeKm());
		
		read.close();
	}

}
