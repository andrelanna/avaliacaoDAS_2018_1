package tests;


import org.junit.Test;

import app.ContaCorrente;
import exceptions.ValorEmBrancoException;

class TstCriacaoDespesasValorEmBranco {
	
	@Test(expected = ValorEmBrancoException.class)
	void testCriacaoContas() throws ValorEmBrancoException {
		int agencia = 1;
		int conta = 1;
		int saldo = 0;
		ContaCorrente contaCorrente = ContaCorrente.obterContaCorrente(agencia, conta, saldo);
		contaCorrente.criarDespesa(0);
	}

}
