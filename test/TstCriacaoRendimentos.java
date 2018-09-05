package test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.ContaCorrente;
import app.Receita;

@RunWith(Parameterized.class)
public class TstCriacaoRendimentos {
	
	public TstCriacaoRendimentos(int agencia, int conta, double saldo, double valorTransacao) {
	
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.valorTransacao = valorTransacao;
	}

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{1, 2, 0, 10}, {1, 1, 5, 5}, {1, 3, -3, 6}
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
