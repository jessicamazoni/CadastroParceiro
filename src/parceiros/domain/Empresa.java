package parceiros.domain;

public class Empresa {
	
	private String nome;
	private String endereco;
	private String cnpj;
	private String ramoAtividade;
	private String contatoFuncionario;
	private int quantidadeFuncionario;
	private double valorHora;
	private int tipoParceiro;
	
	
	public Empresa() {
		super();
	}
	
	
	public Empresa(String nome, String endereco, String cnpj, String ramoAtividade, String contatoFuncionario,
			int quantidadeFuncionario, double valorHora, int tipoParceiro) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.cnpj = cnpj;
		this.ramoAtividade = ramoAtividade;
		this.contatoFuncionario = contatoFuncionario;
		this.quantidadeFuncionario = quantidadeFuncionario;
		this.valorHora = valorHora;
		this.tipoParceiro = tipoParceiro;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRamoAtividade() {
		return ramoAtividade;
	}
	public void setRamoAtividade(String ramoAtividade) {
		this.ramoAtividade = ramoAtividade;
	}
	public String getContatoFuncionario() {
		return contatoFuncionario;
	}
	public void setContatoFuncionario(String contatoFuncionario) {
		this.contatoFuncionario = contatoFuncionario;
	}
	public int getQuantidadeFuncionario() {
		return quantidadeFuncionario;
	}
	public void setQuantidadeFuncionario(int quantidadeFuncionario) {
		this.quantidadeFuncionario = quantidadeFuncionario;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}


	public int getTipoParceiro() {
		return tipoParceiro;
	}


	public void setTipoParceiro(int tipoParceiro) {
		this.tipoParceiro = tipoParceiro;
	}
	

}
