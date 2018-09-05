package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import app.ContaCorrente;
import exceptions.ContaJaCadastradaException;

public class TstCriacaoContas {
		
	@Category(Criacao.class)
	@Test
	public void testCriacao() throws ContaJaCadastradaException {
		ContaCorrente c = ContaCorrente.obterContaCorrente(70, 70, 800);
		assertEquals(c.getAgencia(), 70);
		assertEquals(c.getConta(), 70);
		assertEquals(c.getSaldo(), 800, 0.001);
	}
	
	@Category(Excecao.class)
	@Test(expected = ContaJaCadastradaException.class)
	public void testCriacaoException() throws ContaJaCadastradaException{
		ContaCorrente.obterContaCorrente(50, 15, 20);
		ContaCorrente.obterContaCorrente(50, 15, 20);
	}
}

