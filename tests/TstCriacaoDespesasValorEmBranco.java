package tests;


import org.junit.Test;

import app.ContaCorrente;
import exceptions.ValorEmBrancoException;

public class TstCriacaoDespesasValorEmBranco {
	
	@Test(expected = ValorEmBrancoException.class)
	public void TstCriacaoDespesasValorEmBranco() {
		int agencia = 1;
		int conta = 1;
		int saldo = 0;
		ContaCorrente contaCorrente = ContaCorrente.obterContaCorrente(agencia, conta, saldo);
		contaCorrente.criarDespesa(0);
	}

}
