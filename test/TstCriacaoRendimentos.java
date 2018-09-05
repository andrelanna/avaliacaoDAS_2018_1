package test;

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
import exceptions.ValorEmBrancoException;

@Category(Criacao.class)
@RunWith(Parameterized.class)
public class TstCriacaoRendimentos {
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{ 2, 2, 0, 10, 10 },
			{ 2, 4, 5,  5, 10 },
			{ 2, 3, -3, 6,  3 }
		});
	}
	
	@Parameter
	public int agencia;
	
	@Parameter(1)
	public int numeroConta;
	
	@Parameter(2)
	public double saldoAbertura;
	
	@Parameter(3)
	public float valorTransacao;
	
	@Parameter(4)
	public double saldo;
	
	@Test
	public void testaRendimento() throws ValorEmBrancoException {
		ContaCorrente conta = ContaCorrente.obterContaCorrente(agencia, numeroConta, saldoAbertura);
		assertEquals(saldo, conta.criarReceita(valorTransacao), 0.1);
	}
}
