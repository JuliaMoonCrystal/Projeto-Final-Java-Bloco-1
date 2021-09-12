package Projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class TelaPrincipal {

	public static void main(String[] args) {
       ArrayList<Usuario> listaCliente = new ArrayList<>();
       ArrayList<VagaEmprego> listaVagaEmprego = new ArrayList<>();       
       
       Usuario cliente = new Usuario();		
	   cliente.Adicionar(cliente);
	   cliente.Imprimir();
	   listaCliente.add(cliente);
       cliente.atualizarUsuario(listaCliente);
       cliente.consultarUsuario(listaCliente);
       
       VagaEmprego vaga = new VagaEmprego();
       vaga.AdicionarVagas(listaVagaEmprego);
       vaga.atualizarVaga(listaVagaEmprego.get(0));
       vaga.ExcluirVaga(listaVagaEmprego);
       vaga.pesquisarVagas(listaVagaEmprego);
       vaga.imprimirVaga();
       
	}	
	

}
