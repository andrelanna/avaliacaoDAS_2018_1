package test;

import static org.junit.Assert.*;

import org.junit.Test;

import app.Receita;
import exceptions.ValorEmBrancoException;
import exceptions.ValorNegativoException;

public class TstCriacaoRendimentosValorEmBranco {

	@Test(expected = ValorEmBrancoException.class)
	public void testaCriacaoDeRendimentosEmBranco() throws ValorNegativoException, ValorEmBrancoException {
		double valor = 0f;
		Receita r = new Receita(valor);
		assertTrue(false);
	}

}
