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
public class TstCriacaoRendimentos {
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{ 1, 2, 0, 10, 10},
			{ 1, 1, 5, 5, 10},
			{ 1, 3, -3, 6, 3}
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
		c.criarReceita(mValorTransacao);
		assertEquals(mSaldo, c.getSaldo(), 0.001);
	}
}