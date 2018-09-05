package app;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import exceptions.ContaJaCadastradaException;

//@Category(Excecao.class)
public class TstCricaoContaJaCadastrada {

	@Test(expected = ContaJaCadastradaException.class)
	public void contaCorrenteJaCriada() throws ContaJaCadastradaException {
		ContaCorrente novaConta = new ContaCorrente(2407, 282, 10.0);
		ContaCorrente.obterContaCorrente(2407, 282, 10.0);
	}

}
