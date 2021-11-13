package br.com.generation.Exercicio04;

public class Funcionario {
	
	private String nome;
	private String setor;
	private int meta;
	private double salario;
	private double salarioExtra = 0.0;
	private double horaExtra;
	
	public double fazendoHoraExtra(double horaExtra) {
		return salarioExtra += + salario + (10 * horaExtra);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public int getMeta() {
		return meta;
	}

	public void setMeta(int meta) {
		this.meta = meta;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalarioExtra() {
		return salarioExtra;
	}

	public void setSalarioExtra(double salarioExtra) {
		this.salarioExtra = salarioExtra;
	}

	public double getHoraExtra() {
		return horaExtra;
	}

	public void setHoraExtra(double horaExtra) {
		this.horaExtra = horaExtra;
	}	
}