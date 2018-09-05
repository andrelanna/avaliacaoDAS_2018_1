package avaliacaoDAS_2018_1.app;

import static org.junit.Assert.assertEquals;

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
@Category({TstCriacaoDespesas.class})
class DespesaTest {
	
	@Parameters
	public static Collection<Object[]> despesas(){
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
	
	
	public DespesaTest(int agencia, int conta, double saldoAbertura, float valorTransacao, double saldo ) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldoAbertura = saldoAbertura;
		this.valorTransacao = valorTransacao;
		this.saldo = saldo;
	}

	@Test
	public void despesasTest() throws ContaJaCadastradaException, ValorEmBrancoException {
		ContaCorrente conta1 = new ContaCorrente(agencia, conta, saldoAbertura); //criando uma conta corrente
		double saldoFinal = conta1.criarDespesa(valorTransacao); //adicionando uma despesa à conta criada.
		
		assertEquals(saldo,saldoFinal,1);
	}

}
