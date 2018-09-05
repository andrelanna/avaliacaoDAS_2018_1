package test.parameterized;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.ContaCorrente;
import exceptions.ContaJaCadastradaException;
import exceptions.ValorEmBrancoException;
import test.category.CriacaoCategory;

@RunWith(Parameterized.class)
@Category(CriacaoCategory.class)
public class TstCriacaoRendimento {
	int ag;
	int cc;
	double saldoA;
	float valorT;
	double saldo;
	ContaCorrente c;
	
	public TstCriacaoRendimento(int ag, int cc, double saldoA, float valorT, double saldo) {
		this.ag = ag;
		this.cc = cc;
		this.saldoA = saldoA;
		this.valorT = valorT;
		this.saldo = saldo;
	}
	
	@Test()
	public void testCriacaoDespesas() throws ValorEmBrancoException {
		double saldoI;
		try {
			c = ContaCorrente.obterContaCorrente(ag, cc, saldoA);
		} catch (ContaJaCadastradaException e) {
			c = ContaCorrente.pesquisarContaCorrente(ag, cc);
		}
		saldoI = c.getSaldo();
		
		c.criarReceita(valorT);
		
		Assert.assertEquals(saldoI + valorT, c.getSaldo(), 0.1);
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{1, 2, 0.0d, 10.0f, 10.0d},
			{1, 1, 5.0d, 5.0f, 10.0d},
			{1, 3, -3.0d, 6.0f, 3.0d}
		});
	}
}
