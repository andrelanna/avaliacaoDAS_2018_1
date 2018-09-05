package app;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import exceptions.ValorEmBrancoException;

@Category(Excecao.class)
public class TstCriacaoDespesasEmBrancoTest {

	@Test(expected = ValorEmBrancoException.class)
	public void criaDespesa() throws ValorEmBrancoException {
		ContaCorrente novaConta = new ContaCorrente(0002, 0003, 14.0);
		novaConta.criarDespesa(0);
	}

}
