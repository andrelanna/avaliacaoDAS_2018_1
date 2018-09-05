package test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;

import app.ContaCorrente;
import exceptions.ValorEmBrancoException;

public class TstCriacaoDespesaValorEmBranco {
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	
	@Category(Excecao.class)
	@Test
	public void testaCriarDespesaValorEmBranco() throws ValorEmBrancoException {
		int agencia = 5;
		int noConta = 2;
		int saldo = 3;
		
		ContaCorrente conta = ContaCorrente.obterContaCorrente(agencia, noConta, saldo);
		
		thrown.expect(ValorEmBrancoException.class);
		conta.criarDespesa(0);
	}
}