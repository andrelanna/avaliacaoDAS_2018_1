package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import app.ContaCorrente;
import exceptions.ContaJaCadastradaException;

public class TstExcessaoContas {

	private ContaCorrente conta;
	
	@Before
	public void SetUp() {
		conta = ContaCorrente.obterContaCorrente(1, 1, 100);
	}
	
	@Test(expected = ContaJaCadastradaException.class)
	public void testContaJaCadastradaException() throws ContaJaCadastradaException {
		ContaCorrente.obterContaCorrente(1, 1, 100);
	}

}
