package tests;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import app.ContaCorrente;
import exceptions.ValorEmBrancoException;

public class TstCriacaoRendimentosValorEmBranco {
	
	@Category(Excecao.class)
	@Test(expected = ValorEmBrancoException.class)
	public void test() throws ValorEmBrancoException {
		ContaCorrente c = ContaCorrente.obterContaCorrente(1, 1, 5);
		c.criarReceita(0);
	}
}
