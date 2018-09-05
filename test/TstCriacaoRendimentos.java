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
import app.Receita;
import exceptions.ContaJaCadastradaException;
import exceptions.ValorEmBrancoException;
import exceptions.ValorNegativoException;

@Category({
	Criacao.class,
	Excecao.class
})
@RunWith(Parameterized.class)
public class TstCriacaoRendimentos {

	int agencia, conta;
	double saldoAbertura, valorTransacao, saldo;
	
	public TstCriacaoRendimentos(int agencia, int conta, double saldoAbertura, double valorTransacao, double saldo) {
		this.agencia=agencia;
		this.conta=conta;
		this.saldoAbertura = saldoAbertura;
		this.valorTransacao = valorTransacao;
		this.saldo = saldo;
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{1,2,0,10,10},
			{1,1,5,5,10},
			{1,3,-3,6,3}
		});
	}
	
	@Test
	public void testaCriacaoDeRendimentos() throws ValorNegativoException, ValorEmBrancoException {
		double valor = 1000f;
		Receita r = new Receita(valor);
		assertEquals(valor, r.getValorTransacao(),0.01f);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testaCriacaoDeRendimentosNegativo() throws ValorNegativoException, ValorEmBrancoException {
		double valor = -2f;
		Receita r = new Receita(valor);
		assertTrue(false);	
	}
}
