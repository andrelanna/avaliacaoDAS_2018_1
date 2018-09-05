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
import exceptions.ValorEmBrancoException;

@RunWith(Parameterized.class)
public class TstCriacaoDespesas {
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{ 10, 2, 0, 10, -10},
			{ 10, 1, 5, 3, 2},
			{ 10, 3, 3, 3, 0}
		});
	}
	
	@Parameter
	public int mAgencia;
	@Parameter(1)
	public int mConta;
	@Parameter(2)
	public int mSaldoAbertura;
	@Parameter(3)
	public float mValorTransacao;
	@Parameter(4)
	public double mSaldo;
	
	@Category(Criacao.class)
	@Test()
	public void test() throws ValorEmBrancoException {
		ContaCorrente c = ContaCorrente.obterContaCorrente(mAgencia, mConta, mSaldoAbertura);
		c.criarDespesa(mValorTransacao);
		assertEquals(mSaldo, c.getSaldo(), 0.001);
	}	
}