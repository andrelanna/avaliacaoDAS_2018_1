package tests;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import app.ContaCorrente;
import exceptions.ValorEmBrancoException;

public class TstCriacaoDespesasValorEmBranco {
	
	@Category(Excecao.class)
	@Test(expected = ValorEmBrancoException.class)
	public void test() throws ValorEmBrancoException {
		ContaCorrente c = ContaCorrente.obterContaCorrente(20, 20, 5);
		c.criarDespesa(0);
	}
}
