package br.com.generation.Exercicio02;

import java.util.Scanner;

public class TesteAvião {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		Avião aviao = new Avião();
		
		System.out.println("Tipo de motor: ");
		String tipoDeMotor = read.next();
		aviao.setTipoDeMotor(tipoDeMotor);
		
		System.out.println("Cor do avião: ");
		String cor = read.next();
		aviao.setCor(cor);
		
		System.out.println("Tamanho do avião: ");
		int tamanhoMetros = read.nextInt();
		aviao.setTamanhoMetros(tamanhoMetros);
		
		System.out.println("Tipo de motor: " + aviao.getTipoDeMotor());
		System.out.println("Cor do avião: " + aviao.getCor());
		System.out.println("Tamanho em metros do avião: " + aviao.getTamanhoMetros() + " metros");
		aviao.acelerar(20);
		System.out.println("Velocidade máxima do avião: " + aviao.getVelocidadeKm());
		
		read.close();
	}

}
