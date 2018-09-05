package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import app.ContaCorrente;
import exceptions.ContaJaCadastradaException;

public class TstCriacaoContas {

	private ContaCorrente conta;
	
	@Test
	public void testObterContaCorrente() {
		conta = ContaCorrente.obterContaCorrente(1, 1, 100);
		assertEquals(1, conta.agencia);
		assertEquals(1, conta.conta);
		assertEquals(100, conta.saldo, 0.001);
	}

}
