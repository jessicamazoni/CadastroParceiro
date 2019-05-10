package parceiros.domain;

public class Empresa extends Parceiro{
	
	// Definindo atributos de empresa.
	private String nome;
	private String endereco;
	private String cnpj;
	private String ramoAtividade;
	private String contatoFuncionario;
	private int quantidadeFuncionario;
	private double valorHora;
	private int tipoParceiro;

	//Chama o construtor da superclasse.
		public Empresa() {
			super();
		}	
	
	//Getters e Setters
	
	//Nome
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Endereco
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	//CNPJ
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	//Ramo Atividade
	public String getRamoAtividade() {
		return ramoAtividade;
	}
	public void setRamoAtividade(String ramoAtividade) {
		this.ramoAtividade = ramoAtividade;
	}
	
	//Contato Funcionario
	public String getContatoFuncionario() {
		return contatoFuncionario;
	}
	public void setContatoFuncionario(String contatoFuncionario) {
		this.contatoFuncionario = contatoFuncionario;
	}
	
	//Quantidade Funcionario
	public int getQuantidadeFuncionario() {
		return quantidadeFuncionario;
	}
	public void setQuantidadeFuncionario(int quantidadeFuncionario) {
		this.quantidadeFuncionario = quantidadeFuncionario;
	}
	
	//Valor por hora
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	//Tipo de Parceiro
	public int getTipoParceiro() {
		return tipoParceiro;
	}
	public void setTipoParceiro(int tipoParceiro) {
		this.tipoParceiro = tipoParceiro;
	}
}
