package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import app.ContaCorrente;
import exceptions.ValorEmBrancoException;


@Category(Excecao.class)
public class TesteCriacaoRendimentoValorEmBrancoExcecao {

	
	@Test(expected = ValorEmBrancoException.class)
	public void criacaoTestes() throws ValorEmBrancoException {
		ContaCorrente conta = new ContaCorrente(3,3,4);
		double result = conta.criarReceita(0);
		
	}
}
