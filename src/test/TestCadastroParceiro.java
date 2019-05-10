package test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import parceiros.domain.Empresa;

public class TestCadastroParceiro {
	
	@Test
	public void testPrintMessage() {
		Empresa e = new Empresa();
		e.setNome("teste");
		e.setEndereco("teste");
		e.setCnpj("teste");
		e.setRamoAtividade("teste");
		e.setQuantidadeFuncionario(22);
		e.setContatoFuncionario("teste");
		e.setValorHora(22.8);
		e.setTipoParceiro(1);
		
		assertEquals( 1, e.getTipoParceiro());
	}

}
