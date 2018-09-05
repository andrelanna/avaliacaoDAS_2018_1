package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import app.ContaCorrente;
import categories.Excecao;
import exceptions.ValorEmBrancoException;

public class TstCriacaoRendimentosValorEmBranco {
	
	@Category(Excecao.class)
	@Test (expected = ValorEmBrancoException.class)
	public void TestRendimento() throws ValorEmBrancoException {
		ContaCorrente contaN = ContaCorrente.obterContaCorrente(4, 1, 1);
		
		contaN.criarReceita(0);
		
		assertEquals(0, contaN.getSaldo(), 1);
	}
}
