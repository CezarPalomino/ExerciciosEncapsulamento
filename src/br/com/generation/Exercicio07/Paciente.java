package br.com.generation.Exercicio07;

public class Paciente {
	
	private String nomePaciente;
	private String estado;
	private int idade;
	private String setor;
	private String status;
	
	public String recebeAlta(String novoStatus) {
		if(novoStatus == "Alta Aprovada") {
			status = "Alta Aprovada";
			System.out.println(status);
		}
		return novoStatus;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
