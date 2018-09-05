package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import app.ContaCorrente;
import exceptions.ValorEmBrancoException;

@Category(Excecao.class)
public class TstCriacaoRendimentosValorEmBranco {
	
	@Test(expected = ValorEmBrancoException.class)
	public void testIfAgenciaEmBranco() throws ValorEmBrancoException {
		ContaCorrente conta = ContaCorrente.obterContaCorrente(3, 1, 10);
		conta.criarReceita(0);
		
	}

}
