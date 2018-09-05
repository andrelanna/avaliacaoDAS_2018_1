package tests;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.ContaCorrente;
import exceptions.ContaJaCadastradaException;


@RunWith(Parameterized.class)
public class TstCriacaoContas {
	
	private int agencia;
	private int conta;
	private double saldo;
	
	
	public TstCriacaoContas(int agencia, int conta, double saldo) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][]{
			{10, 20, 30.0},
		});
	}

	@Test(expected = ContaJaCadastradaException.class)
	public void test_cria_conta_existente() {
		ContaCorrente.obterContaCorrente(agencia, conta, saldo);
		ContaCorrente.obterContaCorrente(agencia, conta, saldo);
	}
	
}
