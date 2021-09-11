package Projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class TelaPrincipal {

	public static void main(String[] args) {
       ArrayList<Usuario> lista = new ArrayList<>();
       Usuario user;
       TelaPrincipal tela = new TelaPrincipal();
       user = tela.cadastrarUsuario(lista);
       user.atualizarUsuario(lista);
       user.consultarUsuario(lista);
       user.imprimirLista(lista);
       
	}
	
	public Usuario cadastrarUsuario(ArrayList<Usuario> list) {
		Usuario u;
		Scanner leia = new Scanner(System.in);
		String nome, profi, telefone, idioma, passaporte, paisOrigem;
		char sexo;
		
		System.out.println("Escreva o nome: ");
		nome = leia.next();
		System.out.println("\nEscreva a sua profissão: ");
		profi = leia.next();
		System.out.println("\nEscreva o seu telefone: ");
		telefone = leia.next();
		System.out.println("\nEscreva o seu idioma materno: ");
		idioma = leia.next();
		System.out.println("\nEscreva o numero do passaporte ");
		passaporte = leia.next();
		System.out.println("\nEscreva o nome do seu país de origem: ");
		paisOrigem = leia.next();
		System.out.println("\nDigite o seu sexo (F feminino e M masculino): ");
		sexo = leia.next().charAt(0);
		u = new Usuario(nome, profi, telefone, idioma, passaporte, paisOrigem, sexo);		
		list.add(u);
		return u;
	}

}
