package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import app.ContaCorrente;
import categories.Criacao;
import categories.Excecao;
import exceptions.ContaJaCadastradaException;

public class TstCriacaoContas {
	@Category(Criacao.class)
	@Test
	public void testeCriarConta() {
		ContaCorrente novaConta = ContaCorrente.obterContaCorrente(20, 20, 1);
		assertEquals(novaConta, ContaCorrente.pesquisarContaCorrente(20, 20));
	}
	
	@Category(Excecao.class)
	@Test(expected=ContaJaCadastradaException.class)
	public void testeCriarContaJaCadastrada() {
		ContaCorrente.obterContaCorrente(1500, 1500, 1);
		ContaCorrente.obterContaCorrente(1500, 1500, 1);
	}
}
