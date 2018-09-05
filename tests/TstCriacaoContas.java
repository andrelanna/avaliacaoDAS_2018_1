package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import app.ContaCorrente;
import exceptions.ContaJaCadastradaException;

public class TstCriacaoContas {

	@Test
	public void TstCriacaoDeContaCorrente() {
		
		int agencia = 1;
		int conta = 1;
		double saldo = 0;
		
		ContaCorrente c = ContaCorrente.obterContaCorrente(agencia, conta, saldo);
		
		assertEquals(c, ContaCorrente.pesquisarContaCorrente(agencia, conta));	
	}

}
