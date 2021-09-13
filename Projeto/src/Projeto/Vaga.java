package Projeto;

import java.util.Objects;

public abstract class Vaga { //Classe Mãe e abstrata
	private String nívelEscolaridade;
	private String local;
	private String nomeVaga;
	private String nomeEmpresa;
	public abstract void atualizarVaga(); //método polimorfico, as classes filhas são obrigadas a implementar
	public abstract void imprimirVaga(); //método polimorfico, as classes filhas são obrigadas a implementar
	//Método Construtor com paramentros
	public Vaga(String nívelEscolaridade, String local, String nomeVaga, String nomeEmpresa) {
		this.nívelEscolaridade = nívelEscolaridade;
		this.local = local;
		this.nomeVaga = nomeVaga;
		this.nomeEmpresa = nomeEmpresa;
	}
	//Método Construtor sem paramentros
	public Vaga() {
		
	}
	//Encapsulamento Getters e Setters
	public String getNívelEscolaridade() {
		return nívelEscolaridade;
	}

	public void setNívelEscolaridade(String nívelEscolaridade) {
		this.nívelEscolaridade = nívelEscolaridade;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getNomeVaga() {
		return nomeVaga;
	}

	public void setNomeVaga(String nomeVaga) {
		this.nomeVaga = nomeVaga;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(local, nomeEmpresa, nomeVaga, nívelEscolaridade);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vaga other = (Vaga) obj;
		return Objects.equals(local, other.local) && Objects.equals(nomeEmpresa, other.nomeEmpresa)
				&& Objects.equals(nomeVaga, other.nomeVaga)
				&& Objects.equals(nívelEscolaridade, other.nívelEscolaridade);
	}
	
	

}
