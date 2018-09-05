package tests;


import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.ContaCorrente;
import exceptions.ValorEmBrancoException;

@RunWith(Parameterized.class)
public class TstCriacaoDespesas {
	
	private int agencia;
	private int conta;
	private double saldoAbertura;
	private float valorTransacao;
	private double saldo;
	
	public TstCriacaoDespesas(int agencia, int conta, double saldoAbertura, 
			float valorTransacao, double saldo) {
		
		this.agencia = agencia;
		this.conta = conta;
		this.saldoAbertura = saldoAbertura;
		this.valorTransacao = valorTransacao;
		this.saldo = saldo;
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][]{
			{1, 2, 0, 10, -10},
			{1, 1, 5, 3, 2},
			{1, 3, 3, 3, 0}
		});
	}

	@Test
	public void test_cria_rendimento() throws ValorEmBrancoException {
		ContaCorrente c = ContaCorrente.obterContaCorrente(agencia, conta, saldoAbertura);
		c.criarDespesa(valorTransacao);
		assertEquals(saldo, c.getSaldo(), 0.01); // fuzz 0.01
	}
	
	
}
