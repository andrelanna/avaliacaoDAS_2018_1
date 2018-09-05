package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import app.ContaCorrente;

@Category(Criacao.class)
public class TesteContaCorrente {

	@Test
	public void testeObterContaCorrente() {
		ContaCorrente novaConta = new ContaCorrente(1, 1, 10);
		
		assertEquals(novaConta.getConta(), 1);
		
	}
}
