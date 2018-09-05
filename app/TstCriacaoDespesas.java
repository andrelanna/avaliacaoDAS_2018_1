package app;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import exceptions.ValorEmBrancoException;

@Category(Criacao.class)
@RunWith(Parameterized.class)
public class TstCriacaoDespesas {

	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
			{1, 2, 0, 10, -10},
			{1, 1, 5, 3, 2},
			{1, 3, 3, 3, 0}
		});
	}
	
	@Parameter(0)
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
	public void criaDespesaParametrizado() throws ValorEmBrancoException {
		ContaCorrente novaConta = new ContaCorrente(agencia, conta, saldoAbertura);
		novaConta.criarDespesa(valorTransacao);
		assertEquals(saldo, novaConta.getSaldo(), 0);
	}
	
}
