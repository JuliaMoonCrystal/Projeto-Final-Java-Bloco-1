package Projeto;

import java.util.Objects;
import java.util.Scanner;

public class Usuario {

	private String nome;
	private String profissão;
	private String telefone;
	private String idioma;
	private String passaporte;
	private String paisOrigem;
	private char sexo;
	
	public Usuario() {
		this.nome = nome;
		this.profissão = profissão;
		this.telefone = telefone;
		this.idioma = idioma;
		this.passaporte = passaporte;
		this.paisOrigem = paisOrigem;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfissão() {
		return profissão;
	}

	public void setProfissão(String profissão) {
		this.profissão = profissão;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getPassaporte() {
		return passaporte;
	}

	public void setPassaporte(String passaporte) {
		this.passaporte = passaporte;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idioma, nome, paisOrigem, passaporte, profissão, sexo, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(idioma, other.idioma) && Objects.equals(nome, other.nome)
				&& Objects.equals(paisOrigem, other.paisOrigem) && Objects.equals(passaporte, other.passaporte)
				&& Objects.equals(profissão, other.profissão) && sexo == other.sexo
				&& Objects.equals(telefone, other.telefone);
	}
	
	public Object Adicionar(Object cliente) {
		Scanner scan = new Scanner(System.in);//Scanner para pegar os dados de usuário
		
		System.out.println("\nCadastro de novo usuário");
		System.out.println("\nDigite o seu nome : ");
		nome= scan.nextLine();
		
		System.out.println("\nDigite a sua profissão : ");
		profissão= scan.nextLine();
		
		System.out.println("\nDigite o seu telefone : ");
		telefone= scan.nextLine();
		
		System.out.println("\nDigite o número do seu passaporte : ");
		passaporte= scan.nextLine();
		
		System.out.println("\nDigite o seu Pais de Origem : ");
		paisOrigem= scan.nextLine();
		
		System.out.println("\nDigite o seu Genêro: ");//depois podemos fazer uma verificação aqui
		sexo= scan.next().charAt(0);
		
		return cliente;
		
	}
	
	public void Imprimir() {
		System.out.println("\nNome : "+nome+ "\nProfissão : "+profissão+"\nTelefone : "+telefone+"\nPassaporte : "+passaporte
				+"\nPais de Origem : "+paisOrigem+"\nGenêro : "+sexo);
	}
	
	

}
