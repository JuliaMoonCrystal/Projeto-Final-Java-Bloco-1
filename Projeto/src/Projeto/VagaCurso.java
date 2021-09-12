package Projeto;

import java.util.Objects;

public class VagaCurso extends Vaga{
	private String regimeMatricula;
	private String duracao;
	private String campus;
	private String turno;
	
	public VagaCurso(String nívelEscolaridade, String local, String nomeVaga, String nomeEmpresa, String regimeMatricula, 
			String duracao, String campus, String turno) {
		super(nívelEscolaridade, local, nomeVaga, nomeEmpresa);
		this.regimeMatricula = regimeMatricula;
		this.duracao = duracao;
		this.campus = campus;
		this.turno = turno;
	}

	public VagaCurso() {
		super();
	}

	public String getRegimeMatricula() {
		return regimeMatricula;
	}

	public void setRegimeMatricula(String regimeMatricula) {
		this.regimeMatricula = regimeMatricula;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getCampus() {
		return campus;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(campus, duracao, regimeMatricula, turno);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		VagaCurso other = (VagaCurso) obj;
		return Objects.equals(campus, other.campus) && Objects.equals(duracao, other.duracao)
				&& Objects.equals(regimeMatricula, other.regimeMatricula) && Objects.equals(turno, other.turno);
	}

	//@Override
	public void atualizarVaga(Object vaga) {
		
	}

	//@Override
	public void imprimirVaga(Object vaga) {
		
		
	}
	
	public void AdicionarVagas() {//deixei void mas quando formos testar vai ter retorno
		
	}
	
	public void ExcluirVaga() {
		
	}
	
	public void pesquisarVagas() {
		
	}
	
	
	
}
