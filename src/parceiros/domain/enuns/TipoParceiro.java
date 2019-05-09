package parceiros.domain.enuns;

public enum TipoParceiro {
	
	 DESENVOLVIMENTO(1), INFRA(2), VENDAS(3), CONTABILIDADE(4);
    
    private final int valor;
    TipoParceiro(int valorOpcao){
        valor = valorOpcao;
    }
    public int getValor(){
        return valor;
    }
}
