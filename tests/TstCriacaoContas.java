package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import app.ContaCorrente;
import categories.Criacao;
import exceptions.ContaJaCadastradaException;

public class TstCriacaoContas {

    @Test
    @Category(Criacao.class)
    public void testCriacaoContaCorrente() {
	ContaCorrente ct = ContaCorrente.obterContaCorrente(27, 13, 300.0);
	assertEquals(ct, ContaCorrente.pesquisarContaCorrente(27, 13));
    }

    @Test(expected = ContaJaCadastradaException.class)
    @Category(Exception.class)
    public void testContaJaCadastradaException() {
	ContaCorrente ct = ContaCorrente.obterContaCorrente(16, 18, 225.0);
	// Tenta criar uma conta com os mesmos dados.
	ContaCorrente ct2 = ContaCorrente.obterContaCorrente(16, 18, 225.0);
    }

}
