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

import app.ContaCorrente;
import categories.Criacao;
import exceptions.ValorEmBrancoException;

@Category(Criacao.class)
@RunWith(Parameterized.class)
public class TstCriacaoDespesa {
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{1, 2, 0, 10, -10},
			{1, 1, 5, 3, 2},
			{1, 3, 3, 3, 0}
		});
	}
	
	@Parameter
	public int agencia;
	
	@Parameter(1)
	public int conta;
	
	@Parameter(2)
	public double saldoAbertura;
	
	@Parameter(3)
	public float valorTransacao;
	
	@Parameter(4)
	public double saldo;
	
	@Test
	public void test() throws ValorEmBrancoException {
		ContaCorrente novaConta = ContaCorrente.obterContaCorrente(agencia, conta, saldoAbertura);
		assertEquals(saldo, novaConta.criarDespesa(valorTransacao), 0.01F);
	}
}
