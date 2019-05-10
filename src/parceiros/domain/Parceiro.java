package parceiros.domain;

import java.util.List;

public class Parceiro {
	
	//Dev
	private List<Integer> listNivelDev;
	private List<String> listLinguagens;
	private int qtdDevDisponiveis;
	
	//Infra
	private List<String> listEquipamentosDisponiveis;
	private int qtdFuncTiDisponiveis;
	private int qtdFuncAdmSistemaDisponivel;
	private List<String> listSistemaSuporte;
	
	//Vendas
	private String nomeOppAberto;
	private double valorOpp;
	private List<String> listEquipamentosNecessarios;
	private List<String> listSoNecessarios;
	private List<String> listLinguagensNecessarias;
	private int tempOpp;
	
	//Contabilidade
	private double valorCobradoMes;
	
	//Getters e Setters
	
	// Dev
	
	//Lista nivel desenvolvedor
	public List<Integer> getListNivelDev() {
		return listNivelDev;
	}

	public void setListNivelDev(List<Integer> listNivelDev) {
		this.listNivelDev = listNivelDev;
	}
	
	//Lista linguagens
	public List<String> getListLinguagens() {
		return listLinguagens;
	}

	public void setListLinguagens(List<String> listLinguagens) {
		this.listLinguagens = listLinguagens;
	}
	
	//Quanditade de desenvolvedores disponiveis
	public int getQtdDevDisponiveis() {
		return qtdDevDisponiveis;
	}

	public void setQtdDevDisponiveis(int qtdDevDisponiveis) {
		this.qtdDevDisponiveis = qtdDevDisponiveis;
	}
	
	//Infra
	
	//Lista de equipamentos disponiveis
	public List<String> getListEquipamentosDisponiveis() {
		return listEquipamentosDisponiveis;
	}

	public void setListEquipamentosDisponiveis(List<String> listEquipamentosDisponiveis) {
		this.listEquipamentosDisponiveis = listEquipamentosDisponiveis;
	}

	//Quantidade de funcionarios disponiveis
	public int getQtdFuncTiDisponiveis() {
		return qtdFuncTiDisponiveis;
	}

	public void setQtdFuncTiDisponiveis(int qtdFuncTiDisponiveis) {
		this.qtdFuncTiDisponiveis = qtdFuncTiDisponiveis;
	}
	
	//Quantidade de funcionarios de administracao de distema disponivel
	public int getQtdFuncAdmSistemaDisponivel() {
		return qtdFuncAdmSistemaDisponivel;
	}
	
	public void setQtdFuncAdmSistemaDisponivel(int qtdFuncAdmSistemaDisponivel) {
		this.qtdFuncAdmSistemaDisponivel = qtdFuncAdmSistemaDisponivel;
	}
	
	//Lista de sistema de suporte
	public List<String> getListSistemaSuporte() {
		return listSistemaSuporte;
	}

	public void setListSistemaSuporte(List<String> listSistemaSuporte) {
		this.listSistemaSuporte = listSistemaSuporte;
	}
	
	//Vendas
	
	//Nome da oportunidade em aberto
	public String getNomeOppAberto() {
		return nomeOppAberto;
	}

	public void setNomeOppAberto(String nomeOppAberto) {
		this.nomeOppAberto = nomeOppAberto;
	}

	//Valor oportunidade
	public double getValorOpp() {
		return valorOpp;
	}

	public void setValorOpp(double valorOpp) {
		this.valorOpp = valorOpp;
	}
	
	//Lista de Equipamentos Necessarios
	public List<String> getListEquipamentosNecessarios() {
		return listEquipamentosNecessarios;
	}

	public void setListEquipamentosNecessarios(List<String> listEquipamentosNecessarios) {
		this.listEquipamentosNecessarios = listEquipamentosNecessarios;
	}
	
	//Lista de Sistemas Operacionais Necessarios
	public List<String> getListSoNecessarios() {
		return listSoNecessarios;
	}

	public void setListSoNecessarios(List<String> listSoNecessarios) {
		this.listSoNecessarios = listSoNecessarios;
	}

	//Lista de Linguagens necessarias
	public List<String> getListLinguagensNecessarias() {
		return listLinguagensNecessarias;
	}

	public void setListLinguagensNecessarias(List<String> listLinguagensNecessarias) {
		this.listLinguagensNecessarias = listLinguagensNecessarias;
	}
	
	//Tempo da Oportunidade
	public double getTempOpp() {
		return tempOpp;
	}

	public void setTempOpp(int tempOpp) {
		this.tempOpp = tempOpp;
	}

	//Contabilidade
	
	//Valor cobrado no mes
	public double getValorCobradoMes() {
		return valorCobradoMes;
	}

	public void setValorCobradoMes(double valorCobradoMes) {
		this.valorCobradoMes = valorCobradoMes;
	}
}




