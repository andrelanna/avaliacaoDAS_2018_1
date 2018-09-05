package testes;

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


@Category({Criacao.class})
@RunWith(Parameterized.class)
public class TestCriacaoDespesas {

	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList( new Object[][] {
			{2,2,0,10,-10},{2,1,5,3,2},{2,3,3,3,0}
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
	public void testCriacaoRendimentos() throws ValorEmBrancoException  {
		ContaCorrente conta1 = ContaCorrente.obterContaCorrente(agencia, conta, saldoAbertura);
		assertEquals(saldo,conta1.criarDespesa(valorTransacao), 0.001);
	}
}