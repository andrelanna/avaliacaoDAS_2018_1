package test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.ContaCorrente;
import app.Despesa;

@RunWith(Parameterized.class)
public class TstCriacaoDespesas {
	
	
	public TstCriacaoDespesas(int agencia, int conta, double saldo, double valorTransacao) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.valorTransacao = valorTransacao;
	}

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{1, 2, 0, 10}, {1, 1, 5, 3}, {1, 3, 3, 3}
		});
	}
	private int agencia;
	private int conta;
	private double saldo;
	private double valorTransacao;
	
	@Test
	public void test() throws Exception {
		assertEquals(ContaCorrente.obterContaCorrente(agencia, conta, saldo) , valorTransacao);
	}
	
}
