package parceiros.impl;

import java.util.ArrayList;
import java.util.List;

import parceiros.domain.Empresa;
import parceiros.interfaces.ParceiroInt;

//Implementando interface ParceiroInt na classe ParceiroImpl.
public class ParceiroImpl implements ParceiroInt {

	@Override
	public void trataParceiro(Empresa empresa, int tipoParceiro) {
		int swValue;
		
		//Cadastro Parceiro Dev 
		if(tipoParceiro == 1) {
			List<Integer> listNiveis = new ArrayList<Integer>();
			List<String> listLinguagens = new ArrayList<String>();
			
			//Mostrara o cadastro de nivel do desenvolvedor enquanto o usuario nao escolher opcao 4 (sair).
			do {
				System.out.println(" ____________________________");
				System.out.println("|CADASTRO NIVEL DESENVOLVEDOR|");
				System.out.println("|----------------------------|");
				System.out.println("| OPCOES:                    |");
				System.out.println("|   1. JUNIOR                |");
				System.out.println("|   2. PLENO                 |");
				System.out.println("|   3. SENIOR                |");
				System.out.println("|   4. SAIR                  |");
				System.out.println("|____________________________|");
				swValue = Keyin.inInt("\n SELECIONE A OPCAO: ");
				
				// Adicionando a variavel "swValue" na lista Niveis.
				listNiveis.add(swValue);
			}while (swValue == 1 || swValue == 2 || swValue == 3);
			
			empresa.setListNivelDev(listNiveis);
			
			//Mostrara o cadastro de linguagens de programacao enquanto o usuario nao escolher opcao 4 (sair).
			do {
				System.out.println(" __________________________________");
				System.out.println("|CADASTRO LINGUAGENS DE PROGRAMACAO|");
				System.out.println("|----------------------------------|");
				System.out.println("| OPCOES:                          |");
				System.out.println("|   1. JAVA                        |");
				System.out.println("|   2. PHP                         |");
				System.out.println("|   3. PYTHON                      |");
				System.out.println("|   4. SAIR                        |");
				System.out.println("|__________________________________|");
				swValue = Keyin.inInt("\n SELECIONE A OPCAO: ");
				
				//Adiciona linguagem Java se opcao 1 for escolhida.
				if(swValue == 1) {
					listLinguagens.add("JAVA");
				}
				//Adiciona linguagem PHP se opcao 2 for escolhida.
				else if (swValue == 2){
					listLinguagens.add("PHP");
				}
				//Adiciona linguagem PYTHON se opcao 3 for escolhida.
				else if (swValue == 3) {
					listLinguagens.add("PYTHON");
				}
			}while (swValue == 1 || swValue == 2 || swValue == 3);
			
			empresa.setListLinguagens(listLinguagens);
			
			empresa.setQtdDevDisponiveis(Keyin.inInt("\n DIGITE A QUANTIDADE DE DESENVOLVEDORES DISPONIVEIS: "));
			
			
		//Cadastro Parceiro Infra 	
		}else if (tipoParceiro == 2) {
			List<String> listEquipamentosDisponiveis = new ArrayList<String>();
			List<String> listSistemaSuporte = new ArrayList<String>();
			
			//Mostrara o cadastro de equipamentos disponiveis enquanto o usuario nao escolher opcao 4 (sair).
			do {
				System.out.println(" _________________________________");
				System.out.println("|CADASTRO EQUIPAMENTOS DISPONIVEIS|");
				System.out.println("|---------------------------------|");
				System.out.println("| OPCOES:                         |");
				System.out.println("|   1. STORAGE                    |");
				System.out.println("|   2. COMPUTADOR                 |");
				System.out.println("|   3. SWITCH                     |");
				System.out.println("|   4. SAIR                       |");
				System.out.println("|_________________________________|");
				swValue = Keyin.inInt("\n SELECIONE A OPCAO: ");
				
				//Adiciona STORAGE se opcao 1 for escolhida.
				if(swValue == 1) {
					listEquipamentosDisponiveis.add("STORAGE");
				} 
				//Adiciona COMPUTADOR se opcao 1 for escolhida.
				else if (swValue == 2){
					listEquipamentosDisponiveis.add("COMPUTADOR");
				}
				//Adiciona SWITCH se opcao 1 for escolhida.
				else if (swValue == 3) {
					listEquipamentosDisponiveis.add("SWITCH");
				}
				
			}while (swValue == 1 || swValue == 2 || swValue == 3);
			
			empresa.setListEquipamentosDisponiveis(listEquipamentosDisponiveis);
			
			empresa.setQtdFuncTiDisponiveis(Keyin.inInt("\n DIGITE A QUANTIDADE DE FUNCIONARIOS DE TI DISPONIVEIS: "));
			empresa.setQtdFuncAdmSistemaDisponivel(Keyin.inInt("DIGITE A QUANTIDADE DE FUNCIONARIOS ADMINISTRADORES DE SISTEMAS DISPONIVEIS: "));
			
			//Mostrara o cadastro de sistemas operacionais suportados enquanto o usuario nao escolher opcao 4 (sair).
			do {
				System.out.println(" _________________________________________");
				System.out.println("|CADASTRO SISTEMAS OPERACIONAIS SUPORTADOS|");
				System.out.println("|-----------------------------------------|");
				System.out.println("| OPCOES:                                 |");
				System.out.println("|   1. LINUX                              |");
				System.out.println("|   2. WINDOWS                            |");
				System.out.println("|   3. MAC OS                             |");
				System.out.println("|   4. SAIR                               |");
				System.out.println("|_________________________________________|");
				swValue = Keyin.inInt("\n SELECIONE A OPCAO: ");
				
				//Adiciona LINUX se opcao 1 for escolhida.
				if(swValue == 1) {
					listSistemaSuporte.add("LINUX");
				} 
				//Adiciona WINDOWS se opcao 2 for escolhida.
				else if (swValue == 2){
					listSistemaSuporte.add("WINDOWS");
				}
				//Adiciona MAC OS se opcao 3 for escolhida.
				else if (swValue == 3) {
					listSistemaSuporte.add("MAC OS");
				}
				
			}while (swValue == 1 || swValue == 2 || swValue == 3);
			
			empresa.setListSistemaSuporte(listSistemaSuporte);
			
			
		//Parceiro Vendas 
		}else if (tipoParceiro == 3) {
			List<String> listEquipamentosNecessarios = new ArrayList<String>();
			List<String> listSoNecessarios = new ArrayList<String>();
			List<String> listLinguagensNecessarias = new ArrayList<String>();
			
			empresa.setNomeOppAberto(Keyin.inString("DIGITE O NOME DA OPORTUNIDADE EM ABERTO: "));
			empresa.setValorOpp(Keyin.inDouble("DIGITE O VALOR DA OPORTUNIDADE: "));
			
			
			do {
				System.out.println(" _________________________________");
				System.out.println("|CADASTRO EQUIPAMENTOS NECESSARIOS|");
				System.out.println("|---------------------------------|");
				System.out.println("| OPCOES:                         |");
				System.out.println("|   1. STORAGE                    |");
				System.out.println("|   2. COMPUTADOR                 |");
				System.out.println("|   3. SWITCH                     |");
				System.out.println("|   4. SAIR                       |");
				System.out.println("|_________________________________|");
				swValue = Keyin.inInt("\n SELECIONE A OPCAO: ");
				
				//Adiciona STORAGE se opcao 1 for escolhida.
				if(swValue == 1) {
					listEquipamentosNecessarios.add("STORAGE");
				}
				//Adiciona COMPUTADOR se opcao 2 for escolhida.
				else if (swValue == 2){
					listEquipamentosNecessarios.add("COMPUTADOR");
				}
				//Adiciona SWITCH se opcao 3 for escolhida.
				else if (swValue == 3) {
					listEquipamentosNecessarios.add("SWITCH");
				}
				
			}while (swValue == 1 || swValue == 2 || swValue == 3);
			
			empresa.setListEquipamentosNecessarios(listEquipamentosNecessarios);
		
			do {
				System.out.println(" __________________________________________");
				System.out.println("|CADASTRO SISTEMAS OPERACIONAIS DISPONIVEIS|");
				System.out.println("|------------------------------------------|");
				System.out.println("| OPCOES:                                  |");
				System.out.println("|   1. LINUX                               |");
				System.out.println("|   2. WINDOWS                             |");
				System.out.println("|   3. MAC OS                              |");
				System.out.println("|   4. SAIR                                |");
				System.out.println("|__________________________________________|");
				swValue = Keyin.inInt("\n SELECIONE A OPCAO: ");
				
				if(swValue == 1) {
					listSoNecessarios.add("LINUX");
				} else if (swValue == 2){
					listSoNecessarios.add("WINDOWS");
				}else if (swValue == 3) {
					listSoNecessarios.add("MAC OS");
				}
				
			}while (swValue == 1 || swValue == 2 || swValue == 3);
			
			empresa.setListSoNecessarios(listSoNecessarios);
			
			do {
				System.out.println(" _______________________________");
				System.out.println("|CADASTRO LINGUAGENS NECESSARIAS|");
				System.out.println("|-------------------------------|");
				System.out.println("| OPCOES:                       |");
				System.out.println("|   1. JAVA                     |");
				System.out.println("|   2. PHP                      |");
				System.out.println("|   3. PYTHON                   |");
				System.out.println("|   4. SAIR                     |");
				System.out.println("|_______________________________|");
				swValue = Keyin.inInt("\n SELECIONE A OPCAO: ");
				
				if(swValue == 1) {
					listLinguagensNecessarias.add("JAVA");
				} else if (swValue == 2){
					listLinguagensNecessarias.add("PHP");
				}else if (swValue == 3) {
					listLinguagensNecessarias.add("PYTHON");
				}
				
			}while (swValue == 1 || swValue == 2 || swValue == 3);
			
			empresa.setListLinguagensNecessarias(listLinguagensNecessarias);
			
			empresa.setValorOpp(Keyin.inInt("DIGITE O TEMPO DA OPORTUNIDADE: "));
			
			
		//Parceiro Contabilidade 	
		}else if (tipoParceiro == 4) {
			empresa.setValorCobradoMes(Keyin.inDouble("DIGITE O VALOR COBRADO NO MES: "));
		}
		System.out.println("\n\n\n*************** CADASTRO EMPRESA REALIZADO COM SUCESSO! ****************\n\n");
		System.out.println("\n\n*************** CADASTRO PARCEIRO REALIZADO COM SUCESSO! ****************\n\n\n");
	}

	//Sobrescrevendo metodo trataAcao do parceiro.
	@Override
	public void trataAcao(int acao, int tipoParceiro) {
		
		//Se parceiro for Dev.
		if(tipoParceiro == 1) {
			if(acao == 2) {
				System.out.println("\n *************** MVP ENTREGUE COM SUCESSO ***************\n");
			} 
			else {
				System.out.println("\n *************** PROJETO FINALIZADO COM SUCESSO ***************\n");
			}
		}
		//Se parceiro for Infra.
		else if(tipoParceiro == 2) {
			if(acao == 2) {
				System.out.println("\n *************** EQUIPAMENTO TROCADO COM SUCESSO ***************\n");
			} 
			else {
				System.out.println("\n *************** SISTEMA ADMINISTRADO COM SUCESSO ***************\n");
			}
		}
		//Se parceiro for Contabilidade.
		if(tipoParceiro == 4) {
			if(acao == 2) {
				System.out.println("\n *************** NOTA FISCAL GERADA COM SUCESSO ***************\n");
			} else if (acao == 3){
				System.out.println("\n *************** IMPOSTOS PAGOS COM SUCESSO ***************\n");
			}else {
				System.out.println("\n *************** PARCEIROS PAGOS COM SUCESSO ***************\n");
			}
		}
	}
}
