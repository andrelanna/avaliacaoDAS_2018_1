package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import app.ContaCorrente;
import categories.Excecao;
import exceptions.ValorEmBrancoException;

public class TstCriacaoDespesasValorEmBranco {

	@Category(Excecao.class)
	@Test (expected = ValorEmBrancoException.class)
	public void TestRendimento() throws ValorEmBrancoException {
		ContaCorrente contaN = ContaCorrente.obterContaCorrente(3, 1, 1);
		
		contaN.criarDespesa(0);
		
		assertEquals(0, contaN.getSaldo(), 1);
	}
}
