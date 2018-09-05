package test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.AfterClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.ContaCorrente;
import exceptions.ValorEmBrancoException;

@RunWith(Parameterized.class)
@Category(Criacao.class)
public class TstCriacaoRendimentos {

	int agencia;
	int conta;
	double saldoAbertura;
	float valorTransacao;
	double saldo;
	
	public TstCriacaoRendimentos (int agencia, int conta, double saldoAbertura, float valorTransacao, double saldo) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldoAbertura = saldoAbertura;
		this.valorTransacao = valorTransacao;
		this.saldo = saldo;
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{9,2,0,10,10},
			{9,1,5,5,10},
			{9, 3,-3, 6, 3}
		});
	}
	@Test
	public void testCriacaoRendimentos() throws ValorEmBrancoException {
		ContaCorrente c = ContaCorrente.obterContaCorrente(agencia, conta, saldoAbertura);
		assertEquals(saldo, c.criarReceita(valorTransacao), 0.1);
	}
	
	 @AfterClass
	    public static void tearDown() {
	    }

}
