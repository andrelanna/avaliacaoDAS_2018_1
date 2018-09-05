package teste;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import app.ContaCorrente;
import exceptions.ValorEmBrancoException;

@Category(Excecao.class)
public class TesteCriacaoDespesaValorEmBranco {

	@Test(expected = ValorEmBrancoException.class)
	public void testeDespesaEmBranco() throws ValorEmBrancoException {
		ContaCorrente conta = new ContaCorrente(8, 8, 8);
		conta.criarDespesa(0);
	}
}
