package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import app.ContaCorrente;

import exceptions.ContaJaCadastradaException;

@Category(Excecao.class)
public class TstCriacaoContas {

	
	@Test(expected = ContaJaCadastradaException.class)
	public void TestContaJaCadastra() throws ContaJaCadastradaException {
		ContaCorrente.obterContaCorrente(0,0,0);
	}
}
