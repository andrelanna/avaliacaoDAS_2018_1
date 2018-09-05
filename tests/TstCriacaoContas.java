package tests;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import categories.Criacao;
import categories.Excecao;
//import org.junit.experimental.categories.Category;

import exceptions.ContaJaCadastradaException;

import app.ContaCorrente;
import static org.junit.Assert.*;


public class TstCriacaoContas {
	
	ContaCorrente contaInicial = ContaCorrente.obterContaCorrente(17, 8, 3);
	
	@Category(Criacao.class)
	@Test
	public void testCadastroContaDiferente() {
		assertEquals("Erro!", ContaCorrente.obterContaCorrente(17, 7, 4).getClass(), contaInicial.getClass());
	}
	
	@Category(Excecao.class)
	@Test (expected = ContaJaCadastradaException.class)
	public void testCadastroContaRepetida() throws ContaJaCadastradaException {
		assertEquals("Erro!", ContaCorrente.obterContaCorrente(17, 8, 3).getClass(), contaInicial.getClass());
	}
}
