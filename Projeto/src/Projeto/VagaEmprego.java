package Projeto;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class VagaEmprego extends Vaga{
	private double salario;
	private String regimeContratacao;
	
	public VagaEmprego(String nívelEscolaridade, String local, String nomeVaga, String nomeEmpresa,
			double salario, String regimeContratacao) {
		super(nívelEscolaridade, local, nomeVaga, nomeEmpresa);
		this.salario = salario;
		this.regimeContratacao = regimeContratacao;
	}

	public VagaEmprego() {
		super();
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getRegimeContratacao() {
		return regimeContratacao;
	}

	public void setRegimeContratacao(String regimeContratacao) {
		this.regimeContratacao = regimeContratacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(regimeContratacao, salario);
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
		VagaEmprego other = (VagaEmprego) obj;
		return Objects.equals(regimeContratacao, other.regimeContratacao)
				&& Double.doubleToLongBits(salario) == Double.doubleToLongBits(other.salario);
	}

	@Override
	public void atualizarVaga() {
		Scanner leia = new Scanner(System.in);
		String str;
		double salario;
		int op;
		System.out.println("O que deseja atualizar?");
		System.out.println("1 - Nivel de Escolaridade: ");
		System.out.println("2 - Local: ");
		System.out.println("3 - Nome da Vaga: ");
		System.out.println("4 - Nome da Empresa: ");
		System.out.println("5 - Salário: ");
		System.out.println("6 - Regime de Contratação: ");
		op = leia.nextInt();
		switch (op) {
		case 1:
			System.out.println("Digite o novo Nivel de Escolaridade");
			str = leia.next();
			setNívelEscolaridade(str);
			break;
		case 2:
			System.out.println("Digite o novo local");
			str = leia.next();
			setLocal(str);
			break;
		case 3:
			System.out.println("Digite o novo nome da vaga");
			str = leia.next();
			setNomeVaga(str);
			break;
		case 4:
			System.out.println("Digite o novo nome da empresa");
			str = leia.next();
			setNomeEmpresa(str);
			break;
		case 5:
			System.out.println("Digite o novo salário");
			salario = leia.nextDouble();
			setSalario(salario);
			break;
		case 6:
			System.out.println("Digite o novo Regime de Contratação");
			str = leia.next();
			setRegimeContratacao(str);
			break;
		default:
			System.out.println("Opção Inválida!");
			break;
		}		
	}
	
    public VagaEmprego AdicionarVagas(ArrayList<VagaEmprego> list) {
    	//Nesse método ele cria a vaga e adiciona na lista
    	VagaEmprego vaga;
    	String nívelEscolaridade, local, nomeVaga, nomeEmpresa, regime;
    	double salario;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva o nome da vaga: ");
		nomeVaga = leia.nextLine();
		System.out.println("\nEscreva o nome da empresa: ");
		nomeEmpresa = leia.nextLine();
		System.out.println("\nEscreva o local da vaga: ");
		local = leia.nextLine();
		System.out.println("\nEscreva o Nível de Escolaridade: ");
		nívelEscolaridade = leia.nextLine();
		System.out.println("\nEscreva o regime de contratação: ");
		regime = leia.nextLine();
		System.out.println("\nEscreva o salário: ");
		salario = leia.nextDouble();
		vaga = new VagaEmprego(nívelEscolaridade, local, nomeVaga, nomeEmpresa, salario, regime);		
		list.add(vaga);
		return vaga;
		
	}
	
	public void ExcluirVaga(ArrayList<VagaEmprego> list) {
		pesquisarVagas(list);
		Scanner leia = new Scanner(System.in);
		int indice;
		System.out.println("Digite o indice da vaga que deseja excluir");
		indice = leia.nextInt();
		if(indice <= list.size()) {
			list.remove(indice);
			System.out.println("Vaga Removida");
		}else {
			System.out.println("Indice não existe");
		}
		
	}
	
	public String pesquisarVagas(ArrayList<VagaEmprego> list) {
		Scanner leia = new Scanner(System.in);
		String pesquisaVaga;
		String vagaEncontrada = null;
		String vagaNaoEncontrada = null;
		String msg = "";
		System.out.println("Digite o nome da vaga desejada: ");
		pesquisaVaga = leia.nextLine();
		System.out.println();
		for(int i = 0; i < list.size(); i++) {			
			if(list.get(i).getNomeVaga().equalsIgnoreCase(pesquisaVaga)) {
				System.out.println("\tResultado da Pesquisa");
				vagaEncontrada =  "Indice: "+i +" | " 
						+"Vaga: "+list.get(i).getNomeVaga()+ "-"
						+" Empresa: "+list.get(i).getNomeEmpresa()+ "-"
						+" Local: "+list.get(i).getLocal()+ "-"
						+" Nivel de Escolaridade: "+list.get(i).getNívelEscolaridade()+ "-"
						+" Regime de Contratação: "+list.get(i).getRegimeContratacao()+ "-"
						+" Salario: "+list.get(i).getSalario();				
				
			}
			else{
				vagaNaoEncontrada = "Vaga Não Encontrada";
			}
			
			if(vagaEncontrada != null) {
				msg = vagaEncontrada;
			}else {
				msg = vagaNaoEncontrada;
			}
	  }
		return msg;
		
	}
		
		public void listarVagasEmprego(ArrayList<VagaEmprego> list) {
			for(int i = 0; i < list.size(); i++) {
				System.out.println("Indice: "+i +" | " 
						+"Vaga: "+list.get(i).getNomeVaga()+ "-"
						+" Empresa: "+list.get(i).getNomeEmpresa()+ "-"
						+" Local: "+list.get(i).getLocal()+ "-"
						+" Nivel de Escolaridade: "+list.get(i).getNívelEscolaridade()+ "-"
						+" Regime de Contratação: "+list.get(i).getRegimeContratacao()+ "-"
						+" Salario: "+list.get(i).getSalario());
			}

		
		
	}

	@Override
	public void imprimirVaga() {
		System.out.println("\nNome da Vaga: "+getNomeVaga()+ "\nEmpresa : "+getNomeEmpresa()+"\nLocal : "+getLocal()+"\nNível de Escolaridade : "+getNívelEscolaridade()
				+"\nRegime de Contratação : "+getRegimeContratacao()+"\nSalario : "+getSalario());				
	}
	
	
}
