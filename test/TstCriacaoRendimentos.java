package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import app.ContaCorrente;
import exceptions.ContaJaCadastradaException;
import exceptions.ValorEmBrancoException;
import test.category.CriacaoCategory;
import test.category.ExcecaoCategory;

public class TstCriacaoRendimentos {

	ContaCorrente c;
	double saldoI;
	
	@Before
	public void setup() {
		try {
			this.c = ContaCorrente.obterContaCorrente(123, 123, 100.00);
		} catch (ContaJaCadastradaException e) {
			this.c = ContaCorrente.pesquisarContaCorrente(123, 123);
		}
		this.saldoI = c.getSaldo();
	}
	
	@Category(CriacaoCategory.class)
	@Test()
	public void criarRendimento() throws ValorEmBrancoException {
		double response = this.c.criarReceita(10.0f);
		Assert.assertEquals(saldoI + 10.0d, response, 0.1);
	}
	
	@Category(ExcecaoCategory.class)
	@Test(expected = ValorEmBrancoException.class)
	public void valorEmBrancoException() throws ValorEmBrancoException {
		this.c.criarReceita(0f);
	}
}
