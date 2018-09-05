package tests;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import app.ContaCorrente;
import exceptions.ContaJaCadastradaException;
import tests.categories.Criacao;
import tests.categories.Excecao;

public class TstCriacaoContas {
	
	@Test
	@Category(Criacao.class)
	public void testCriacaoDeContaCorrente() {
		
		int agencia = 50;
		int conta = 50;
		double saldo = 0;
		
		ContaCorrente c = ContaCorrente.pesquisarContaCorrente(agencia, conta);
		
		if(c == null) {
			c = ContaCorrente.obterContaCorrente(agencia, conta, saldo);
		}
		
		assertEquals(c, ContaCorrente.pesquisarContaCorrente(agencia, conta));
	}
	
	@Test(expected = ContaJaCadastradaException.class)
	@Category(Excecao.class)
	public void testExcecaoCriacaoDeContaCorrente() {
		int agencia = 90;
		int conta = 90;
		double saldo = 0;
		
		ContaCorrente c = ContaCorrente.pesquisarContaCorrente(agencia, conta);
		
		if(c == null) {
			c = ContaCorrente.obterContaCorrente(agencia, conta, saldo);
		}
		
		c = ContaCorrente.obterContaCorrente(agencia, conta, saldo);
	}

}
