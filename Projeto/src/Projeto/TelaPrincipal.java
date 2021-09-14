package Projeto;


import java.util.Scanner;
import java.awt.Cursor;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TelaPrincipal {

	public static void main(String[] args) {
       /*Facriando os objetos das classes*/
		Usuario cliente = new Usuario();
		
		cliente.Adicionar(cliente);
		cliente.Imprimir();

		ArrayList<Usuario> listaCliente = new ArrayList<>();
		ArrayList<VagaEmprego> listaVagaEmprego = new ArrayList<>();
		ArrayList<VagaCurso> listaCurso = new ArrayList<>();
		int opcao = 0;
		
		//Populando listaVagaEmprego
		VagaEmprego v1 = new VagaEmprego("Ensino Médio", "Porto Alegre", "Pintor", "Pinturas e& Cia", 1500, "CLT");
		VagaEmprego v2 = new VagaEmprego("Ensino Médio", "Natal", "Auxiliar de Produção", "Garutti Administração", 1800, "CLT");
		VagaEmprego v3 = new VagaEmprego("Ensino Médio", "São Paulo", "Recepcionista", "Natura", 1300, "CLT");
		VagaEmprego v4 = new VagaEmprego("Ensino Superior", "São Paulo", "Arquiteto", "Jota Nunes", 6000, "CLT");
		VagaEmprego v5 = new VagaEmprego("Ensino Superior", "Rio de Janeiro", "Professor", "Colégio Dom Pedro II", 3500, "CLT");
		listaVagaEmprego.add(v1);
		listaVagaEmprego.add(v2);
		listaVagaEmprego.add(v3);
		listaVagaEmprego.add(v4);
		listaVagaEmprego.add(v5);
		
		//Populando listaCurso
		VagaCurso c1 = new VagaCurso("Ensino Médio", "Rio de Janeiro", "Confeitaria", "Senac", "Anual", "2 anos", "Ipanema", "Noturno");
		VagaCurso c2 = new VagaCurso("Ensino Superior", "São Paulo", "Administração", "PUC-SP", "Semestral", "8 semestres", "Perdizes", "Noturno");
		VagaCurso c3 = new VagaCurso("Ensino Superior", "São Paulo", "Ciências da Computação", "PUC-SP", "Semestral", "8 semestres", "Consolação", "Matutino");
		VagaCurso c4 = new VagaCurso("Ensino Superior", "São Paulo", "Ciências Contábeis", "PUC-SP", "Semestral", "8 semestres", "PMonte Algres", "Noturno");
		VagaCurso c5 = new VagaCurso("Ensino Superior", "São Paulo", "Design", "PUC-SP", "Semestral", "6 semestres", "Marquês Paraguá", "Matutino");
		listaCurso.add(c1);
		listaCurso.add(c2);
		listaCurso.add(c3);
		listaCurso.add(c4);
		listaCurso.add(c5);
		
		//Populando listaCliente
		Usuario u1 = new Usuario("Áurea Brito Arruda", "Auxiliar de Produção", "(76) 38995-3387", "Espanhol", "900.728.650-16", "Equador", 'F');
		Usuario u2 = new Usuario("Kévin Campelo Regueira", "Pintor", "(19) 54224-1403", "Francês", "127.177.510-76", "Haiti", 'M');
		Usuario u3 = new Usuario("Pietro Chagas Piteira", "Enfermeiro", "(31) 88148-8625", "Português", "777.187.940-32", "Angola", 'M');
		listaCliente.add(u1);
		listaCliente.add(u2);
		listaCliente.add(u3);
		
		
		VagaEmprego vaga = new VagaEmprego();
		VagaCurso curso = new VagaCurso();

		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
					"\n 1 - Adicionar usuário;\n" + "\n 2 - Atualizar usuário;\n" + "\n 3 - Consultar usuário;\n"
							+ "\n 4 - Adicionar vagas;\n" + "\n 5 - Pesquisar vagas;\n" + "\n 6 - Excluir vagas\n;"
							+ "\n 7 - Atualizar vagas;\n" + "\n 8 - Imprimir lista de vagas de emprego;\n"
							+ "\n 9 - Adicionar vagas de cursos;\n" + "\n 10 - Atualizar vagas de cursos;\n"
							+ "\n 11 - Pesquisar vagas de curso;\n" + "\n 12 - Excluir vagas de curso;\n"
							+ "\n 13 - Imprimir lista de curso;\n" + "\n 14 - Finalizar programa;\n"));

			switch (opcao) {
			case 1:
				Usuario novoCliente = new Usuario();
				novoCliente.Adicionar(novoCliente);
				listaCliente.add(novoCliente);
				break;

			case 2:				
				cliente.atualizarUsuario(listaCliente);
				break;

			case 3:				
				cliente.consultarUsuario(listaCliente);				
				break;

			case 4:
				vaga.AdicionarVagas(listaVagaEmprego);
				break;

			case 5:		
				System.out.println(vaga.pesquisarVagas(listaVagaEmprego)); // pesquisa pelo nome da vaga
				break;

			case 6:
				vaga.ExcluirVaga(listaVagaEmprego);
				break;

			case 7:
				vaga.listarVagasEmprego(listaVagaEmprego);
				int ind = Integer.parseInt(JOptionPane.showInputDialog(null, "\nEscreva o índice da vaga para atualizar: "));
				listaVagaEmprego.get(ind).atualizarVaga();
				break;

			case 8:
				vaga.listarVagasEmprego(listaVagaEmprego);
				ind = Integer.parseInt(JOptionPane.showInputDialog(null, "\nEscreva o indice da vaga: "));
				listaVagaEmprego.get(ind).imprimirVaga();
				break;

			case 9:
				curso.AdicionarVagas(listaCurso);
				break;

			case 10:
				curso.listarCursos(listaCurso);
				ind = Integer.parseInt(JOptionPane.showInputDialog(null, "\nEscreva o índice do curso para atualizar: "));
				listaCurso.get(ind).atualizarVaga();				
				break;

			case 11:
				System.out.println(curso.pesquisarVagas(listaCurso)); //Pesquisa pelo nome do curso
				break;

			case 12:
				curso.ExcluirVaga(listaCurso);
				break;

			case 13:				
				curso.listarCursos(listaCurso);
				ind = Integer.parseInt(JOptionPane.showInputDialog(null, "\nEscreva o indice do curso: "));
				listaCurso.get(ind).imprimirVaga();
				break;

			case 14:
				JOptionPane.showMessageDialog(null, "\nPrograma finalizado!");
				break;
			
		default:
		JOptionPane.showMessageDialog(null, "opção inválida");
		break;
			}
		  } while (opcao != 14);

		}


	}