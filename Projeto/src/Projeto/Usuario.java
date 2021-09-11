package Projeto;

import java.util.ArrayList;
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
	
	public Usuario(String nome, String profissão, String telefone, String idioma, String passaporte, String paisOrigem,
			char sexo) {
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
	
	public void cadastrarUsuario(ArrayList<Usuario> list) {
		Usuario u;
		Scanner leia = new Scanner(System.in);
		String nome, profi, telefone, idioma, passaporte, paisOrigem;
		char sexo;
		
		System.out.println("Escreva o nome: ");
		nome = leia.next();
		System.out.println("Escreva a sua profissão: ");
		profi = leia.next();
		System.out.println("Escreva o seu telefone: ");
		telefone = leia.next();
		System.out.println("Escreva o seu idioma materno: ");
		idioma = leia.next();
		System.out.println("Escreva o numero do passaporte ");
		passaporte = leia.next();
		System.out.println("Escreva o nome do seu país de origem: ");
		paisOrigem = leia.next();
		System.out.println("Digite o seu sexo (F feminino e M masculino): ");
		sexo = leia.next().charAt(0);
		u = new Usuario(nome, profi, telefone, idioma, passaporte, paisOrigem, sexo);		
		list.add(u);
	}
	
	public void atualizarUsuario(ArrayList<Usuario> list) {
		int indice, op;			
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o indice do usuario a ser atualizado: ");
		indice = leia.nextInt();
		System.out.println("O que deseja atualizar? ");
		System.out.println("1 - Nome");
		System.out.println("2 - Profissão");
		System.out.println("3 - Telefone");
		System.out.println("4 - Idioma");
		System.out.println("5 - Passaporte");
		System.out.println("6 - País de Origem");
		System.out.println("7 - Sexo");
		op = leia.nextInt();		
		switch(op) {
		case 1:
			System.out.println("Digite o novo nome: ");
			String novoNome = leia.next();
			list.get(indice).setNome(novoNome);
		case 2:
			System.out.println("Digite a nova Profissão: ");
			String novaProfi = leia.next();
			list.get(indice).setProfissão(novaProfi);			
		case 3:
			System.out.println("Digite o novo Telefone: ");
			String novoTel = leia.next();
			list.get(indice).setTelefone(novoTel);
		case 4:
			System.out.println("Digite o novo Idioma: ");
			String novoIdioma = leia.next();
			list.get(indice).setIdioma(novoIdioma);		
		case 5:
			System.out.println("Digite o novo Passaporte: ");
			String novoPass = leia.next();		
			list.get(indice).setPassaporte(novoPass);
		case 6:
			System.out.println("Digite o novo país de origem: ");
			String novoPais = leia.next();
			list.get(indice).setPaisOrigem(novoPais);			
		case 7:
			System.out.println("Digite o novo sexo: ");
			char novoSexo = leia.next().charAt(0);		
			list.get(indice).setSexo(novoSexo);
		default:
			System.out.println("Opção Inválida!");
		}
	}
	
	public void consultarUsuario(ArrayList<Usuario> list) {
		Scanner leia = new Scanner(System.in);
		int indice;
		
		System.out.println("Escreva o indice do Usuario a ser consultado: ");
		indice = leia.nextInt();
				
		if(indice <= list.size()) {
			System.out.println("Nome - "+list.get(indice).getNome());
			System.out.println("Profissão - "+list.get(indice).getProfissão());
			System.out.println("Telefone - "+list.get(indice).getTelefone());
			System.out.println("Idioma - "+list.get(indice).getIdioma());
			System.out.println("Passaporte - "+list.get(indice).getPassaporte());
			System.out.println("País de Origem - "+list.get(indice).getPaisOrigem());
			System.out.println("Sexo - "+list.get(indice).getSexo());			
		}else {
			System.out.println("Usuario não existe");
		}
	}
	
	public void imprimirLista (ArrayList<Usuario> list) {
		for(int i = 0; i < list.size();i++) {
			System.out.println("Indice: "+i 
					+" Nome: "+list.get(i).getNome()
					+" Profissão: "+list.get(i).getProfissão()
					+" Telefone: "+list.get(i).getTelefone()
					+" Idioma: "+list.get(i).getIdioma()
					+" Passaporte: "+list.get(i).getPassaporte()
					+" País de Origem: "+list.get(i).getPaisOrigem()
					+" Sexo: "+list.get(i).getSexo());
		}
	}

}
