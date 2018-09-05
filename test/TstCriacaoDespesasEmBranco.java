package test;

import static org.junit.Assert.*;

import org.junit.Test;

import app.Despesa;
import app.Receita;
import exceptions.ValorEmBrancoException;
import exceptions.ValorNegativoException;

public class TstCriacaoDespesasEmBranco {

	@Test(expected = ValorEmBrancoException.class)
	public void testaCriacaoDeDespesasEmBranco() throws ValorNegativoException, ValorEmBrancoException {
		double valor = 0f;
		Despesa d = new Despesa(valor);
		assertTrue(false);
	}

}
