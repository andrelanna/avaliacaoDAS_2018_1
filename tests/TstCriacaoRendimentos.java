package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import categories.Criacao;

import exceptions.ValorEmBrancoException;

import app.ContaCorrente;

@RunWith(Parameterized.class)
public class TstCriacaoRendimentos {
	
	@Parameter(0)
	public int agencia;
	@Parameter(1)
	public int conta;
	@Parameter(2)
	public double saldoAbertura;
	@Parameter(3)
	public int valorTransacao;
	@Parameter(4)
	public int saldo;
	
	@Parameters
	public static Collection<Object[]> params() {
		Object[][] values = {{10,2,0,10,10},
							 {10,1,5,5,10},
							 {10,3,-3,6,3}};
		
		return Arrays.asList(values);
	}
	
	@Category(Criacao.class)
	@Test
	public void TestRendimento() throws ValorEmBrancoException {
		ContaCorrente contaN = ContaCorrente.obterContaCorrente(agencia, conta, saldoAbertura);
		
		contaN.criarDespesa(valorTransacao);
		
		assertEquals(0, contaN.getSaldo(), saldo);
	}
	
}
