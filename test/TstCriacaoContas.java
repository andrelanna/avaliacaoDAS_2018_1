package test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;

import app.ContaCorrente;
import exceptions.ContaJaCadastradaException;

public class TstCriacaoContas {	
	@Category(Criacao.class)
	@Test
	public void testaCriacaoConta() {
		int agencia = 2;
		int noConta = 1;
		int saldo = 3;
		
		ContaCorrente conta = ContaCorrente.obterContaCorrente(agencia, noConta, saldo);
		assertEquals(agencia, conta.getAgencia());
		assertEquals(noConta, conta.getConta());
		assertEquals(saldo, conta.getSaldo(), 0.1);
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Category(Excecao.class)
	@Test
	public void testaCriacaoContaContaJaExiste() {
		int agencia = 2;
		int noConta = 1;
		int saldo = 3;
		
		thrown.expect(ContaJaCadastradaException.class);
		
		ContaCorrente conta = ContaCorrente.obterContaCorrente(agencia, noConta, saldo);
	}
}
