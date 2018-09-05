package test;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import app.ContaCorrente;
import exceptions.ValorEmBrancoException;

@Category(Excecao.class)
public class TstCriacaoRendimentosValorEmBranco {

	@Test(expected = ValorEmBrancoException.class)
	public void tstCriacaoRendimentoValorEmBranco() throws ValorEmBrancoException {
		ContaCorrente c = ContaCorrente.obterContaCorrente(5, 8, 10);
		c.criarReceita(0);
	}

}
