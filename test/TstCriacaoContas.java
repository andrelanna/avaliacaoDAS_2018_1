package test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import app.ContaCorrente;
import exceptions.ContaJaCadastradaException;

public class TstCriacaoContas {


	@Category(Criacao.class)
	@Test
	public void testCriacaoContas() {
		ContaCorrente c = ContaCorrente.obterContaCorrente(1, 1, 0);
		assertEquals(c, ContaCorrente.pesquisarContaCorrente(1, 1));
	}
	
	@Category(Excecao.class)
	@Test(expected = ContaJaCadastradaException.class)
	public void testContaJaCadastradaException() {
		ContaCorrente.obterContaCorrente(1, 1, 0);
		ContaCorrente.obterContaCorrente(1, 1, 0);
	}

}
