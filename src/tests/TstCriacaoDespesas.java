package src.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import src.app.ContaCorrente;
import src.exceptions.ContaJaCadastradaException;
import src.exceptions.ValorEmBrancoException;

@Category(Criacao.class)
@RunWith(Parameterized.class)
public class TstCriacaoDespesas {

	@Parameters(name = "{index}: Conta={1},SaldoInicial= {2}, Despesa={3}, SaldoFinal= {4}")
	public static Collection<Object[]> data() {
		ArrayList<Object[]> despesasTestMass = new ArrayList<Object[]>();
		despesasTestMass.add(new Object[] { 1, 2, 0, 10, -10 });
		despesasTestMass.add(new Object[] { 1, 1, 5, 3, 2 });
		despesasTestMass.add(new Object[] { 1, 3, 3, 3, 0 });

		return despesasTestMass;
	}

	@Parameter
	public int agencia;

	@Parameter(1)
	public int numConta;

	@Parameter(2)
	public int saldoAbertura;

	@Parameter(3)
	public int valorTransacao;

	@Parameter(4)
	public int saldo;

	private ContaCorrente conta;

	@Before
	public void setUp() throws ValorEmBrancoException {
		try {
			conta = ContaCorrente.obterContaCorrente(agencia, numConta, saldoAbertura);
		} catch (ContaJaCadastradaException e) {
			conta = ContaCorrente.pesquisarContaCorrente(agencia, numConta);
			AccountCleaner.setSaldo(conta, saldoAbertura);
		}

	}
	
	/**
	 * Creating a expense with a value of 0 should raise a code exception.
	 * @throws ValorEmBrancoException
	 */
	@Test
	public void testCriarDespesas() throws ValorEmBrancoException {
		conta.criarDespesa(valorTransacao);
		assertEquals(conta.getSaldo(), saldo, 0);
	}


}