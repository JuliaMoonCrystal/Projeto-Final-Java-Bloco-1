package Projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class TelaPrincipal {

	public static void main(String[] args) {
       ArrayList<Usuario> listaCliente = new ArrayList<>();
       ArrayList<VagaEmprego> listaVagaEmprego = new ArrayList<>();
       ArrayList<VagaCurso> listaCurso = new ArrayList<>();
       
       
       Usuario cliente = new Usuario();		
	   cliente.Adicionar(cliente);
	   cliente.Imprimir();
	   listaCliente.add(cliente);
       cliente.atualizarUsuario(listaCliente);
       cliente.consultarUsuario(listaCliente);
       
       VagaEmprego vaga = new VagaEmprego();
       vaga.AdicionarVagas(listaVagaEmprego);
       listaVagaEmprego.get(0).atualizarVaga();//Testando metodo sem parametro e utilizando a lista
       vaga.ExcluirVaga(listaVagaEmprego);
       vaga.pesquisarVagas(listaVagaEmprego);
       vaga.imprimirVaga();
       
       VagaCurso curso = new VagaCurso();
       curso.AdicionarVagas(listaCurso);
       //Operações acessando pela lista
       listaCurso.get(0).atualizarVaga();       
       listaCurso.get(0).imprimirVaga();       
       listaCurso.get(0).pesquisarVagas(listaCurso); // Também funciona -> curso.pesquisarVagas(listaCurso);
       
       curso.ExcluirVaga(listaCurso); //Dá erro se acessar pela lista, pois o elemento da lista não exclui a se mesmo
	}	
	

}
