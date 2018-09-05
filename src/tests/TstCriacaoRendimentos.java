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
public class TstCriacaoRendimentos {

	@Parameters(name = "{index}: Conta={1},SaldoInicial= {2}, Deposito={3}, SaldoFinal= {4}")
	public static Collection<Object[]> data() {
		ArrayList<Object[]> rendimentoTestMass = new ArrayList<Object[]>();
		rendimentoTestMass.add(new Object[] { 1, 2, 0, 10, 10 });
		rendimentoTestMass.add(new Object[] { 1, 1, 5, 5, 10 });
		rendimentoTestMass.add(new Object[] { 1, 3, -3, 6, 3 });

		return rendimentoTestMass;
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
	 * Creating an investment with a value of 0 should raise a code exception.
	 * @throws ValorEmBrancoException
	 */
	@Test
	public void testCriarRendimentos() throws ValorEmBrancoException {
		conta.criarReceita(valorTransacao);
		assertEquals(saldo, conta.getSaldo(), 0);
	}

}
