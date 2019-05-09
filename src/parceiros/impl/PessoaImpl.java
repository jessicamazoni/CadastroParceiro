package parceiros.impl;

import java.util.ArrayList;
import java.util.List;

import parceiros.domain.Empresa;
import parceiros.interfaces.EmpresaInt;

public class PessoaImpl implements EmpresaInt {

	@Override
	public void cadastro() {
		List<Empresa> listEmpresa = new ArrayList<Empresa>();
		int swValue;
		System.out.println("|   MENU CADASTRO PARCEIRO   |");
		System.out.println("| Opcoes:                 |");
		System.out.println("|        1. CADASTRO      |");
		//  System.out.println("|        2. Option 2       |");
		//  System.out.println("|        3. Exit           |");
		swValue = Keyin.inInt(" Selecione a opcao: ");

		
		//TROCAR POR LOOP WHILE************************************************************
		// Switch construct
		switch (swValue) {
		case 1:
			Empresa e = new Empresa();
			e.setNome(Keyin.inString("Digite o nome: "));
			e.setEndereco(Keyin.inString("Digite o endereco: "));
			e.setCnpj(Keyin.inString("Digite o CNPJ: "));
			e.setRamoAtividade(Keyin.inString("Digite o ramo da atividade: "));
			e.setQuantidadeFuncionario(Keyin.inInt("Digite a quantidade de funcionario parceiro: "));
			e.setContatoFuncionario(Keyin.inString("Digite o contato do funcionario: "));
			e.setValorHora(Keyin.inDouble("Digite o valor hora da empresa: "));
			e.setTipoParceiro(Keyin.inInt("Digite o tipo de parceiro conforme listado: DESENVOLVIMENTO(1), INFRA(2), VENDAS(3), CONTABILIDADE(4)"));

			if(e.getTipoParceiro() > 4 || e.getTipoParceiro() < 1) {
				System.out.println("Tipo de parceiro invalido");
				e.setTipoParceiro(Keyin.inInt("Digite o tipo de parceiro conforme listado: DESENVOLVIMENTO(1), INFRA(2), VENDAS(3), CONTABILIDADE(4)"));
			}
			listEmpresa.add(e);

			System.out.println("|   MENU CADASTRO PARCEIRO   |");
			System.out.println("| Opcoes:                 |");
			System.out.println("|        1. CADASTRO      |");
			System.out.println("|        2. SAIR       |");
			//  System.out.println("|        3. Exit           |");
			swValue = Keyin.inInt(" Selecione a opcao: ");

			switch (swValue) {
			case 1:
				e = new Empresa();
				e.setNome(Keyin.inString("Digite o nome: "));
				e.setEndereco(Keyin.inString("Digite o endereco: "));
				e.setCnpj(Keyin.inString("Digite o CNPJ: "));
				e.setRamoAtividade(Keyin.inString("Digite o ramo da atividade: "));
				e.setQuantidadeFuncionario(Keyin.inInt("Digite a quantidade de funcionario parceiro: "));
				e.setContatoFuncionario(Keyin.inString("Digite o contato do funcionario: "));
				e.setValorHora(Keyin.inDouble("Digite o valor hora da empresa: "));
				e.setTipoParceiro(Keyin.inInt("Digite o tipo de parceiro conforme listado: DESENVOLVIMENTO(1), INFRA(2), VENDAS(3), CONTABILIDADE(4)"));

				if(e.getTipoParceiro() > 4 || e.getTipoParceiro() < 1) {
					System.out.println("Tipo de parceiro invalido");
					e.setTipoParceiro(Keyin.inInt("Digite o tipo de parceiro conforme listado: DESENVOLVIMENTO(1), INFRA(2), VENDAS(3), CONTABILIDADE(4)"));
				}
				listEmpresa.add(e);
				System.out.println("qTD LISTA EMPRESA " + listEmpresa.size());

				System.out.println("|   MENU CADASTRO PARCEIRO   |");
				System.out.println("| Opcoes:                 |");
				System.out.println("|        1. CADASTRO      |");
				System.out.println("|        2. SAIR       |");
				//  System.out.println("|        3. Exit           |");
				swValue = Keyin.inInt(" Selecione a opcao: ");

				switch (swValue) {
				case 1:



					break;
				case 2:
					break;
				default:
					System.out.println("Invalid selection");
					break; // This break is not really necessary
				}
			}

			System.out.println("O nome digitado e " + e.getNome());


			break;
		case 2:
			System.out.println("Option 2 selected");
			break;
		case 3:
			System.out.println("Exit selected");
			break;
		default:
			System.out.println("Invalid selection");
			break; // This break is not really necessary
		}
	}

}


class Keyin {

	//*******************************
	//   support methods
	//*******************************
	//Method to display the user's prompt string
	public static void printPrompt(String prompt) {
		System.out.print(prompt + " ");
		System.out.flush();
	}

	//Method to make sure no data is available in the
	//input stream
	public static void inputFlush() {
		int dummy;
		int bAvail;

		try {
			while ((System.in.available()) != 0)
				dummy = System.in.read();
		} catch (java.io.IOException e) {
			System.out.println("Input error");
		}
	}
	public static String inString() {
		int aChar;
		String s = "";
		boolean finished = false;

		while (!finished) {
			try {
				aChar = System.in.read();
				if (aChar < 0 || (char) aChar == '\n')
					finished = true;
				else if ((char) aChar != '\r')
					s = s + (char) aChar; // Enter into string
			}

			catch (java.io.IOException e) {
				System.out.println("Input error");
				finished = true;
			}
		}
		return s;
	}

	public static String inString(String prompt) {
		while (true) {
			inputFlush();
			printPrompt(prompt);
			try {
				return inString();
			}

			catch (NumberFormatException e) {
				System.out.println("Invalid input. Not an integer");
			}
		}
	}

	public static int inInt(String prompt) {
		while (true) {
			inputFlush();
			printPrompt(prompt);
			try {
				return Integer.valueOf(inString().trim()).intValue();
			}

			catch (NumberFormatException e) {
				System.out.println("Invalid input. Not an integer");
			}
		}
	}

	public static double inDouble(String prompt) {
		while (true) {
			inputFlush();
			printPrompt(prompt);
			try {
				return Double.valueOf(inString().trim()).doubleValue();
			}

			catch (NumberFormatException e) {
				System.out.println("Invalid input. Not an integer");
			}
		}
	}

}

