package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.ContaCorrente;

@RunWith(Parameterized.class)
public class TstCriacaoRendimentos {

	private int agencia;
	private int conta;
	private double saldoAbertura;
	private double valorTransacao;
	private double saldo;
	
	
	public TstCriacaoRendimentos(int agencia, 
			int conta, double saldoAbertura, double valorTransacao, double saldo) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldoAbertura = saldoAbertura;
		this.valorTransacao = valorTransacao;
		this.saldo = saldo;
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{1, 2, 0, 10, 10},
			{1, 1, 5, 5, 10},
			{1, 3, -3, 6, 3}
		});
	}
	
	@Test
	public void testCriacaoRendimentos() {
		ContaCorrente c = ContaCorrente.obterContaCorrente(agencia, conta, saldo);
		
		double r = valorTransacao + saldoAbertura;
		
		assertEquals(r, saldo, 0);
	}

}
