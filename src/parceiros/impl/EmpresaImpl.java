package parceiros.impl;

import java.util.ArrayList;
import java.util.List;

import parceiros.domain.Empresa;
import parceiros.interfaces.EmpresaInt;
import parceiros.interfaces.ParceiroInt;

public class EmpresaImpl implements EmpresaInt {

	private ParceiroInt parceiroInt = new ParceiroImpl();

	// List é uma interface e o ArrayList é a classe que a implementa.
	@Override
	public void cadastro() {
		List<Empresa> listEmpresa = new ArrayList<Empresa>();
		int swValue;
		System.out.println(" _________________________");
		System.out.println("|       MENU EMPRESA      |");
		System.out.println("|-------------------------|");
		System.out.println("| OPCOES:                 |");
		System.out.println("|   1. CADASTRO EMPRESA   |");
		System.out.println("|   2. SAIR               |");
		System.out.println("|_________________________|");
		swValue = Keyin.inInt("\n SELECIONE A OPCAO: ");
		
		// Faça cadastro da empresa enquanto swValue receber 1.
		if (swValue == 1) {
			do {
				Empresa e = new Empresa();
				e.setNome(Keyin.inString("DIGITE O NOME: "));
				e.setEndereco(Keyin.inString("DIGITE O ENDERECO: "));
				e.setCnpj(Keyin.inString("DIGITE O CNPJ: "));
				e.setRamoAtividade(Keyin.inString("DIGITE O RAMO DA ATIVIDADE: "));
				e.setQuantidadeFuncionario(Keyin.inInt("DIGITE A QUANTIDADE DE FUNCIONARIO PARCEIRO: "));
				e.setContatoFuncionario(Keyin.inString("DIGITE O CONTATO DO FUNCIONARIO: "));
				e.setValorHora(Keyin.inDouble("DIGITE O VALOR POR HORA: "));
				System.out.println ("\nDIGITE O TIPO DE PARCEIRO CONFORME LISTADO:");
				e.setTipoParceiro(Keyin.inInt(" DESENVOLVIMENTO(1), INFRAESTRUTURA(2), VENDAS(3), CONTABILIDADE(4)"));
				parceiroInt.trataParceiro(e, e.getTipoParceiro());

				// Adicionando o objeto "e" na lista empresa. 
				listEmpresa.add(e);
				
				//Independente do tipo de parceiro escolhido, o menu parceiro vai apresentar a opcao de cadastrar outra empresa.
				System.out.println(" ______________________________________");
				System.out.println("|             MENU PARCEIRO            |");
				System.out.println("|--------------------------------------|");
				System.out.println("| OPCOES:                              |");
				System.out.println("|   1. CADASTRO EMPRESA                |");
				
				//Se tipo parceiro for igual a 1, rodar metodos parceiro dev.
				if(e.getTipoParceiro() == 1) {
					System.out.println("|   2. ENTREGAR MVP                    |");
					System.out.println("|   3. ENTREGAR PROJETO FINALIZADO     |");
					System.out.println("|   4. SAIR                            |");
					System.out.println("|______________________________________|");
				}
				//Se tipo parceiro for igual a 2, rodar metodos parceiro infra.
				else if(e.getTipoParceiro() == 2) {
					System.out.println("|   2. TROCAR EQUIPAMENTO              |");
					System.out.println("|   3. ADMINISTRAR SISTEMA             |");
					System.out.println("|   4. SAIR                            |");
					System.out.println("|______________________________________|");
				}
				//Se tipo parceiro for igual a 4, rodar metodos parceiro contabilidade.
				else if(e.getTipoParceiro() == 4) {
					System.out.println("|   2. GERAR NOTA FISCAL               |");
					System.out.println("|   3. PAGAR IMPOSTOS                  |");
					System.out.println("|   4. PAGAR PARCEIROS                 |");
					System.out.println("|   5. SAIR                            |");
					System.out.println("|______________________________________|");
				}
				swValue = Keyin.inInt("\n SELECIONE A OPCAO: ");
				
				if(swValue == 2 || swValue == 3 || swValue == 4 ) {
					if(e.getTipoParceiro() == 4 && swValue == 4 ) {
						parceiroInt.trataAcao(swValue, e.getTipoParceiro());
					} 
					else if(swValue == 2 || swValue == 3 ) {
						parceiroInt.trataAcao(swValue, e.getTipoParceiro());
					}
				}
			} while (swValue == 1);
			
			// A empresa so e cadastrada com sucesso apos ter cadastrado pelo menos um parceiro.
			System.out.println("\n\n\n*************** CADASTRO REALIZADO COM SUCESSO! ****************\n\n\n");

			//Mostra menu da empresa apos cadastrar pelo menos um parceiro para a empresa cadastrada antes.
			do {
				System.out.println(" _________________________________");
				System.out.println("|          MENU EMPRESA           |");
				System.out.println("|---------------------------------|");
				System.out.println("| OPCOES:                         |");
				System.out.println("|   1. EDITAR EMPRESA             |");
				System.out.println("|   2. EXCLUIR EMPRESA            |");
				System.out.println("|   3. LISTAR TODAS AS EMPRESAS   |");
				System.out.println("|   4. GERAR FATURA               |");
				System.out.println("|   5. ALOCAR FUNCIONARIO         |");
				System.out.println("|   6. LIBERAR FUNCIONARIO        |");
				System.out.println("|   7. SAIR                       |");
				System.out.println("|_________________________________|");
				swValue = Keyin.inInt("\n SELECIONE A OPCAO: ");

				//Se swValue receber 3, listara todas as empresas cadastradas.
				if(swValue == 3) {
					System.out.println("\n *************** EMPRESAS CADASTRADAS ****************\n");
					for(Empresa e : listEmpresa) {
						System.out.println("Nome: " + e.getNome() +"\n");
						System.out.println("Endereco: " + e.getEndereco() +"\n");
						System.out.println("CNPJ: " + e.getCnpj() +"\n");
						System.out.println("Ramo da atividade: " + e.getRamoAtividade() +"\n");
						System.out.println("Quantidade de funcionario parceiro: " + e.getQuantidadeFuncionario() +"\n");
						System.out.println("Contato do funcionario: " + e.getContatoFuncionario() +"\n");
						System.out.println("Valor por hora: " + e.getValorHora() +"\n");
						System.out.println("\n*****************************************************\n");
					}
				}
				//Se swValue receber 1, o usuario ira editar a empresa desejada.
				else if(swValue == 1) {
					String nomeEmpresa = Keyin.inString("DIGITE O NOME DA EMPRESA QUE DESEJA ALTERAR: ");
					boolean altSucess = false;
					for(Empresa e : listEmpresa) {
						if(e.getNome().toLowerCase().equals(nomeEmpresa.toLowerCase())) {
							e.setNome(Keyin.inString("DIGITE O NOVO NOME: "));
							altSucess = true;
						}
					}
					if(altSucess) {
						System.out.println("\n***************NOME DA EMPRESA ALTERADO COM SUCESSO***************\n");
					} 
					else {
						System.out.println("\n***************EMPRESA NAO EXISTE***************\n");
					}
				} 
				//Se swValue receber 2, o usuario ira excluir a empresa desejada.
				else if(swValue == 2) {
					String nomeEmpresa = Keyin.inString("DIGITE O NOME DA EMPRESA QUE DESEJA EXCLUIR: ");
					boolean altSucess = false;
					for(int i = 0; i <= listEmpresa.size(); i++) {
						Empresa e = listEmpresa.get(i);
						if(e.getNome().toLowerCase().equals(nomeEmpresa.toLowerCase())) {
							listEmpresa.remove(i);
							altSucess = true;
						}
					}
					if(altSucess) {
						System.out.println("\n***************EMPRESA EXCLUIDA COM SUCESSO***************\n");
					} else {
						System.out.println("\n***************EMPRESA NAO EXISTE***************\n");
					}
				}
				//Se swValue receber 4, 5 ou 6 o sistema mostrara o metodo escolhido.
				else if( swValue == 4 || swValue == 5 || swValue == 6) {
					trataAcao(swValue);
				}
			}while (swValue == 1 || swValue == 2 || swValue == 3 || swValue == 4 || swValue == 5 || swValue == 6);	
		}
		else {
			System.out.println("\n*************** SISTEMA FINALIZADO ***************");
		}
	}
	
	//Sobrescrevendo metodo trataAcao da empresa.
	@Override
	public void trataAcao(int acao) {
		if( acao == 4) {
			System.out.println("\n FATURA GERADA COM SUCESSO");
		}
		else if (acao == 5) {
			System.out.println("\n FUNCIONARIO ALOCADO COM SUCESSO");
		}
		else {
			System.out.println("\n FUNCIONARIO LIBERADO COM SUCESSO");
		}
	}
}


class Keyin {
	//Method to display the user's prompt string
	public static void printPrompt(String prompt) {
		System.out.print(prompt + " ");
		System.out.flush();
	}

	//Method to make sure no data is available in the
	//input stream
	public static void inputFlush() {
		@SuppressWarnings("unused")
		int dummy;
		@SuppressWarnings("unused")
		int bAvail;

		try {
			while ((System.in.available()) != 0)
				dummy = System.in.read();
		} catch (java.io.IOException e) {
			System.out.println("\n ERRO DE ENTRADA");
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
				System.out.println("\n ERRO DE ENTRADA");
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
				System.out.println("\n ENTRADA INVALIDA");
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
				System.out.println("\n ENTRADA INVALIDA");
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
				System.out.println("\n ENTRADA INVALIDA");
			}
		}
	}
}