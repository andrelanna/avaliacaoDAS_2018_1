package app;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import exceptions.ValorEmBrancoException;

@Category({Excecao.class})
public class TstCriacaoDespesaValorEmBranco {
	
	@Test(expected = ValorEmBrancoException.class)
	public void testCriacaoRendimentosEmBranco() throws ValorEmBrancoException {
		ContaCorrente conta1 = ContaCorrente.obterContaCorrente(5, 2, 0);
		conta1.criarDespesa(0);
	}
}
