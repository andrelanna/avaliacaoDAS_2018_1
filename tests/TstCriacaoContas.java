package tests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import app.ContaCorrente;
import app.ContaCorrente.*;
import exceptions.ContaJaCadastradaException;

class TstCriacaoContas {
	
	private int conta;
	private int agencia;
	private double saldo;
	
	public TstCriacaoContas() {
		this.conta = 1;
		this.agencia = 1;
		this.saldo = 10;
	}

	@Test(expected = ContaJaCadastradaException.class)
	void testCriacaoContas() {
		ContaCorrente contaCorrente = ContaCorrente.obterContaCorrente(this.conta, this.agencia, this.saldo);
		ContaCorrente pesquisaConta = ContaCorrente.pesquisarContaCorrente(this.agencia, this.conta);
		assertEquals(contaCorrente, pesquisaConta);
		ContaCorrente.obterContaCorrente(agencia, conta, saldo);
	}

}
