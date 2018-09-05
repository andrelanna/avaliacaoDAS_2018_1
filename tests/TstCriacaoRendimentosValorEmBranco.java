package tests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import app.ContaCorrente;
import exceptions.ValorEmBrancoException;

public class TstCriacaoRendimentosValorEmBranco {
	
	private ContaCorrente contaCorrente;
	
	public TstCriacaoRendimentosValorEmBranco() {
		int agencia = 1;
		int conta = 1;
		int saldo = 0;
		this.contaCorrente = ContaCorrente.obterContaCorrente(agencia, conta, saldo);
	}

	@Test(expected = ValorEmBrancoException.class)
	public void testCriacaoContas() {
		this.contaCorrente.criarReceita(0);
	}

}
