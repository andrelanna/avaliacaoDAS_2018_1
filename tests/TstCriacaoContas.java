package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import app.ContaCorrente;
import exceptions.ContaJaCadastradaException;


public class TstCriacaoContas {
	
	@Test
	public void testCriacaoDeContaCorrente() {
		
		int agencia = 1;
		int conta = 1;
		double saldo = 0;
		
		ContaCorrente c = ContaCorrente.obterContaCorrente(agencia, conta, saldo);
		
		assertEquals(c, ContaCorrente.pesquisarContaCorrente(agencia, conta));	
	}
	
	@Test(expected = ContaJaCadastradaException.class)
	public void testExcecaoCriacaoDeContaCorrente() {
		int agencia = 1;
		int conta = 1;
		double saldo = 0;
		
		ContaCorrente.obterContaCorrente(agencia, conta, saldo);
	}

}
