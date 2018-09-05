package app;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import exceptions.ValorEmBrancoException;

@Category(Excecao.class)
public class TstCriacaoRendimentosEmBranco {

	@Test(expected = ValorEmBrancoException.class)
	public void criaReceita() throws ValorEmBrancoException {
		ContaCorrente novaConta = new ContaCorrente(0001, 0004, 12.0);
		novaConta.criarReceita(0);
	}

}
