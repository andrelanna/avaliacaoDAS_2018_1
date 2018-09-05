package tests;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import app.ContaCorrente;
import categories.Excecao;
import exceptions.ValorEmBrancoException;

@Category(Excecao.class)
public class TstCriacaoRendimentosValorEmBranco {
	@Test(expected=ValorEmBrancoException.class)
	public void testeCriacaoDespesaEmBranco() throws ValorEmBrancoException {
		ContaCorrente novaConta = ContaCorrente.obterContaCorrente(7, 7, 1);
		novaConta.criarReceita(0);
	}
}
