package test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import app.ContaCorrente;
import exceptions.ContaJaCadastradaException;
import test.category.CriacaoCategory;
import test.category.ExcecaoCategory;

public class TstCriacaoConta {	

	@Category(CriacaoCategory.class)
	@Test()
	public void criarConta() throws ContaJaCadastradaException {
		ContaCorrente c = ContaCorrente.obterContaCorrente(321, 654, 100.00);
		Assert.assertEquals(321, c.getAgencia());
		Assert.assertEquals(654, c.getConta());
		Assert.assertEquals(100.00, c.getSaldo(), 0.01);
	}
	
	@Category(ExcecaoCategory.class)
	@Test(expected = ContaJaCadastradaException.class)
	public void contaJaCriadaException() throws ContaJaCadastradaException {
		ContaCorrente.obterContaCorrente(123, 456, 10.00d);
		ContaCorrente.obterContaCorrente(123,  456, 10.00);
	}
}
