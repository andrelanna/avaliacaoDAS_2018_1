package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import app.ContaCorrente;
import exceptions.ContaJaCadastradaException;

@Category(Criacao.class)
public class TstCriacaoContas {

	@Test
	public void testCriacaoDeConta() {
		ContaCorrente.obterContaCorrente(2, 3, 4);
	}
	
	@Test(expected = ContaJaCadastradaException.class)
	public void testCriacaoDeContaJaCadastrada() {
		ContaCorrente.obterContaCorrente(2, 3, 4);
	}

}
