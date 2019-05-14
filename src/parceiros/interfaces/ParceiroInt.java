package parceiros.interfaces;

import parceiros.domain.Empresa;

//Metodo com passagem de parametro por interface - Parceiro
public interface ParceiroInt {
	void trataParceiro(Empresa empresa, int tipoParceiro);
	void trataAcao(int acao, int tipoParceiro);
}
