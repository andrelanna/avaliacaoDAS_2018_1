package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import app.ContaCorrente;
import exceptions.ContaJaCadastradaException;

@Category(Excecao.class)
public class TesteCriacaoContaException {

	@Test(expected = ContaJaCadastradaException.class)
	public void criacaoTesteExececao() {
		
		ContaCorrente.obterContaCorrente(1, 1, 10);
		ContaCorrente.obterContaCorrente(1, 1, 10);
		
	}
}
