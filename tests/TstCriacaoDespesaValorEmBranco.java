package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import app.ContaCorrente;
import exceptions.ValorEmBrancoException;
import tests.categories.Excecao;

@Category(Excecao.class)
public class TstCriacaoDespesaValorEmBranco {
	
	private int agencia = 200;
	private int conta = 200;

	@Test(expected = ValorEmBrancoException.class)
	public void testCriacaoDespesaValorEmBranco() throws ValorEmBrancoException {
		ContaCorrente c = ContaCorrente.pesquisarContaCorrente(agencia, conta);
		
		if(c == null) {
			c = ContaCorrente.obterContaCorrente(200, 200, 0);
		}
		
		c.criarDespesa(0);
	}

}
