package test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;


import app.ContaCorrente;
import app.Criacao;
import app.Excecao;
import exceptions.ContaJaCadastradaException;

@Category({Criacao.class, Excecao.class})
public class TstCriacaoContas {
		
	@Test
	public void testaCriacaoDeConta () {
		ContaCorrente c = ContaCorrente.obterContaCorrente(001, 001, 100);
		assertEquals(c, ContaCorrente.pesquisarContaCorrente(001, 001));
	}
	
	@Test(expected = ContaJaCadastradaException.class)
	public void testaContaJaCadastrada() {
		ContaCorrente c = ContaCorrente.obterContaCorrente(001, 001, 100);
		assertFalse(false);
	}
}
