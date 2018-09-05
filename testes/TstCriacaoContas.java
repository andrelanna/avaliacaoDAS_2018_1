package testes;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import app.ContaCorrente;
import app.Criacao;
import app.Excecao;
import exceptions.ContaJaCadastradaException;

public class TstCriacaoContas {
	
	@Category(Criacao.class)
	@Test
	public void testCriacaoConta() {
		ContaCorrente.obterContaCorrente(4, 2, 0);
		Assert.assertNotNull(ContaCorrente.pesquisarContaCorrente(4, 2));
	}
	
	@Category(Excecao.class)
	@Test(expected = ContaJaCadastradaException.class)
	public void testContaJaCadastradaException() {
		ContaCorrente.obterContaCorrente(4, 2, 0);
	}
}
