package br.com.generation.Exercicio02;

public class Avião {
	
	private String tipoDeMotor;
	private String cor;
	private int tamanhoMetros;
	private int velocidadeKm = 500;
	
	void acelerar(int aceleracao) {
		velocidadeKm += + aceleracao;
	}

	public String getTipoDeMotor() {
		return tipoDeMotor;
	}

	public void setTipoDeMotor(String tipoDeMotor) {
		this.tipoDeMotor = tipoDeMotor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getTamanhoMetros() {
		return tamanhoMetros;
	}

	public void setTamanhoMetros(int tamanhoMetros) {
		this.tamanhoMetros = tamanhoMetros;
	}

	public int getVelocidadeKm() {
		return velocidadeKm;
	}

	public void setVelocidadeKm(int velocidadeKm) {
		this.velocidadeKm = velocidadeKm;
	}
}