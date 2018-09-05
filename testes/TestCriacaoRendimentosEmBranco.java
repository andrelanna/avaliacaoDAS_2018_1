package testes;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import app.ContaCorrente;
import exceptions.ValorEmBrancoException;

@Category({Excecao.class})
public class TestCriacaoRendimentosEmBranco {
	
	@Test(expected = ValorEmBrancoException.class)
	public void testCriacaoRendimentosEmBranco() throws ValorEmBrancoException {
		ContaCorrente conta1 = ContaCorrente.obterContaCorrente(3, 3, 0);
		conta1.criarReceita(0);
	}
}
