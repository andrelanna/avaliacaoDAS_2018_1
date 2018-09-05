package test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.ContaCorrente;
import app.Criacao;
import app.Despesa;
import app.Excecao;
import exceptions.ContaJaCadastradaException;
import exceptions.ValorEmBrancoException;
import exceptions.ValorNegativoException;

@Category({
	Criacao.class,
	Excecao.class
})
@RunWith(Parameterized.class)
public class TstCriacaoDespesas {

	int agencia, conta;
	double saldoAbertura, valorTransacao, saldo;
	
	public TstCriacaoDespesas(int agencia, int conta, double saldoAbertura, double valorTransacao, double saldo) {
		this.agencia=agencia;
		this.conta=conta;
		this.saldoAbertura = saldoAbertura;
		this.valorTransacao = valorTransacao;
		this.saldo = saldo;
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{1,2,0,10,-10},
			{1,1,5,3,2},
			{1,3,3,3,0}
		});
	}
	
	@Test
	public void testaCriacaoDeDespesas() throws ValorNegativoException, ValorEmBrancoException {
		double valor = 1000f;
		Despesa d = new Despesa(valor);
		assertEquals(valor, d.getValorTransacao(),0.01f);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testaCriacaoDeDespesasNegativo() throws ValorNegativoException, ValorEmBrancoException {
		double valor = -2f;
		Despesa d = new Despesa(valor);
		assertTrue(false);	
	}

	@Test(expected = ValorEmBrancoException.class)
	public void testaCriacaoDeDespesasEmBranco() throws ValorNegativoException, ValorEmBrancoException {
		double valor = 0f;
		Despesa d = new Despesa(valor);
		assertTrue(false);
	}
}
