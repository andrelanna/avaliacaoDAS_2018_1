package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import app.ContaCorrente;
import exceptions.ValorEmBrancoException;

public class TstCriacaoDespesaValorEmBranco {
	
	@Test(expected = ValorEmBrancoException.class)
	public void testSeValorTransacaoEmBranco() throws ValorEmBrancoException {
		ContaCorrente conta = ContaCorrente.obterContaCorrente(3, 1, 10);
		conta.criarDespesa(0);
		
	}

}
