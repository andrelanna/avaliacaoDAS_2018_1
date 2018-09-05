package src.tests;

import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import src.app.ContaCorrente;
import src.exceptions.ContaJaCadastradaException;

@RunWith(JUnit4.class)
public class TstCriacaoContas {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Category(Criacao.class)
	@Test
	public void shouldNotRegisterRepeatedAccount() throws ContaJaCadastradaException{
		
		// Register a new Account should be fine;
		ContaCorrente.obterContaCorrente(10, 10, 0);
		
		// Register the same Account now should give Exception
		thrown.expect(ContaJaCadastradaException.class);
		ContaCorrente.obterContaCorrente(10, 10, 0);
	}
	
}