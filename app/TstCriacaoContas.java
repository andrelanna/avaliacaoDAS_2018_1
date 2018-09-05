package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(Criacao.class)
public class TstCriacaoContas {
	
	@Test
	public void criaContaCorrente() {
		ContaCorrente novaConta = new ContaCorrente(2407, 282, 10.0);
		assertNotNull(novaConta);
	}

}
