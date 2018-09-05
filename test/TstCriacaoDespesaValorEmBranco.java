package test;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import app.ContaCorrente;
import exceptions.ValorEmBrancoException;

@Category(Excecao.class)
public class TstCriacaoDespesaValorEmBranco {

	@Test(expected = ValorEmBrancoException.class)
	public void tstCriacaoDespesaValorEmBranco () throws ValorEmBrancoException {
		ContaCorrente c = ContaCorrente.obterContaCorrente(7, 8, 10);
		c.criarDespesa(0);
	}
}
