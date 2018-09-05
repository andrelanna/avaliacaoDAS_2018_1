package tests;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import app.ContaCorrente;
import exceptions.ContaJaCadastradaException;

public class TstCriacaoContas {

	@Category(Criacao.class)
	@Test
	public void CriacaoContaValida( ) {
		ContaCorrente contaNumeroUm = ContaCorrente.obterContaCorrente(1, 123456, 500);
		assertNotNull("A conta não foi criada", contaNumeroUm);
	}
	
	@Category(Excecao.class)
	@Test(expected = ContaJaCadastradaException.class)
	public void CriacaoContaRepetida( ) {
		ContaCorrente contaNumeroDois = ContaCorrente.obterContaCorrente(1, 123456, 500);
		assertNotNull("A conta não foi criada", contaNumeroDois);
		
		ContaCorrente contaNumeroTres = ContaCorrente.obterContaCorrente(1, 123456, 500);
	}
	
}
