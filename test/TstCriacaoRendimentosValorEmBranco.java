package test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;

import app.ContaCorrente;
import exceptions.ValorEmBrancoException;

public class TstCriacaoRendimentosValorEmBranco {
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	
	@Category(Excecao.class)
	@Test
	public void testaCriarRendimentoValorEmBranco() throws ValorEmBrancoException {
		int agencia = 4;
		int noConta = 2;
		int saldo = 3;
		
		ContaCorrente conta = ContaCorrente.obterContaCorrente(agencia, noConta, saldo);
		
		thrown.expect(ValorEmBrancoException.class);
		conta.criarReceita(0);
	}
}
