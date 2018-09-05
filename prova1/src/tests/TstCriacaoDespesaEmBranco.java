package tests;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import app.ContaCorrente;
import categories.Excecao;
import exceptions.ValorEmBrancoException;

@Category(Excecao.class)
public class TstCriacaoDespesaEmBranco {
	@Test(expected=ValorEmBrancoException.class)
	public void testeCriacaoDespesaEmBranco() throws ValorEmBrancoException {
		ContaCorrente novaConta = ContaCorrente.obterContaCorrente(6, 6, 1);
		novaConta.criarDespesa(0);
	}
}
