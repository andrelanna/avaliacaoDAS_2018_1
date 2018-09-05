package tests;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.junit.Test;

import exceptions.ContaJaCadastradaException;
import prova.ContaCorrente;

public class TstCriacaoContas {
	// Cria��o de uma conta
	// Exce��o de conta corrente j� cadastrada
	
	@Test
	public void tstCriacaoContas() {
		try {
			ContaCorrente.obterContaCorrente(1, 2, 0);
			fail("Expected an ContaJaCadastradaException to be thrown");
		} catch (ContaJaCadastradaException contaJaCadastradaException) {
			assertThat(contaJaCadastradaException.getMessage(), is(1, 2, 0));
		}
	}

}