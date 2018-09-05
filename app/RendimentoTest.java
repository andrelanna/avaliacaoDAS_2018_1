package avaliacaoDAS_2018_1.app;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import avaliacaoDAS_2018_1.exceptions.ContaJaCadastradaException;
import avaliacaoDAS_2018_1.exceptions.ValorEmBrancoException;

@RunWith(Parameterized.class)
@Category({TstCriacaoRendimentos.class})
public class RendimentoTest {

	@Parameters
	public static Collection<Object[]> rendimentos(){
		return Arrays.asList(new Object[][] {
			{1,2,0,10,-10},
			{1,1,5,3,2},
			{1,3,3,3,0}
		});
	}
	
	private int agencia;
	private int conta;
	private double saldoAbertura;
	private double valorTransacao;
	private double saldo;
	
	public RendimentoTest(int agencia, int conta, double saldoAbertura, float valorTransacao, double saldo ) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldoAbertura = saldoAbertura;
		this.valorTransacao = valorTransacao;
		this.saldo = saldo;
	}

	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
