package test;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import app.ContaCorrente;
import exceptions.ContaJaCadastradaException;

public class TstCriacoContas {
	@Category(Categoria.class)
	@Test(expected = Exception.class)
	public void test() throws Exception {
		ContaCorrente.obterContaCorrente(0, 0, 0);
	}
}
