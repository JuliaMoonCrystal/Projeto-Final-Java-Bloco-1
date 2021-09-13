package Projeto;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TelaPrincipal {

	public static void main(String[] args) {
		ArrayList<Usuario> listaCliente = new ArrayList<>();
		ArrayList<VagaEmprego> listaVagaEmprego = new ArrayList<>();
		ArrayList<VagaCurso> listaCurso = new ArrayList<>();
		int opcao = 0;

		Usuario cliente = new Usuario();
		VagaEmprego vaga = new VagaEmprego();
		VagaCurso curso = new VagaCurso();

		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
					"\n 1 - Adicionar usuário;" + "\n 2 - Atualizar usuário;" + "\n 3 - Consultar usuário;"
							+ "\n 4 - Adicionar vagas;" + "\n 5 - Pesquisar vagas;" + "\n 6 - Excluir vagas;"
							+ "\n 7 - Atualizar vagas;" + "\n 8 - Imprimir lista de vagas de emprego;"
							+ "\n 9 - Adcionar vagas de cursos;" + "\n 10 - Atualizar vagas de cursos;"
							+ "\n 11 - Pesquisar vagas de curso;" + "\n 12 - Excluir vagas de curso;"
							+ "\n 13 - Imprimir lista de curso;" + "\n 14 - Finalizar programa;"));

			switch (opcao) {
			case 1:// Tentar adcionar mais de um cliente por vez.
				cliente.Adicionar(cliente);
				listaCliente.add(cliente);
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
				vaga.pesquisarVagas(listaVagaEmprego);// Temos que consetar o loop infinito aqui !! aiaia
				break;

			case 6:
				vaga.ExcluirVaga(listaVagaEmprego);
				break;

			case 7:
				listaVagaEmprego.get(0).atualizarVaga();
				break;

			case 8:
				vaga.imprimirVaga();
				break;

			case 9:
				curso.AdicionarVagas(listaCurso);
				break;

			case 10:
				listaCurso.get(0).atualizarVaga();//o metodo funciona, mas precisa arrumar opção invalida
				break;

			case 11:
				listaCurso.get(0).pesquisarVagas(listaCurso);
				break;

			case 12:
				curso.ExcluirVaga(listaCurso);
				break;

			case 13:
				listaCurso.get(0).imprimirVaga();
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

