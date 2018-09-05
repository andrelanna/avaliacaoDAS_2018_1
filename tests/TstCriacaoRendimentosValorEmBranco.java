package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import app.ContaCorrente;
import exceptions.ValorEmBrancoException;
import tests.categories.Excecao;

@Category(Excecao.class)
public class TstCriacaoRendimentosValorEmBranco {

	@Test(expected = ValorEmBrancoException.class)
	public void testCriacaoRendimentoValorZero() throws ValorEmBrancoException {
		ContaCorrente c = ContaCorrente.obterContaCorrente(100, 100, 0);
		c.criarReceita(0);
	}

}
