package test;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import app.Receita;

public class TstCriacaoRendimentosValorEmBranco {
	@Category(Categoria.class)
	@Test(expected = Exception.class)
	public void test() {
		//Receita.
	}
}