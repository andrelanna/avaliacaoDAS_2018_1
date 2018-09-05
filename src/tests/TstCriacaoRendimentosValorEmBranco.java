package src.tests;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;

import src.app.ContaCorrente;
import src.exceptions.ContaJaCadastradaException;
import src.exceptions.ValorEmBrancoException;

public class TstCriacaoRendimentosValorEmBranco {

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	private ContaCorrente conta;
	
	@Before
	public void setUp() {
		try {
			conta = ContaCorrente.obterContaCorrente(1, 1, 0);
		} catch (ContaJaCadastradaException e) {
			conta = ContaCorrente.pesquisarContaCorrente(1, 1);
		}
	}
	
	@Category(Excecao.class)
	@Test
	public void shouldTestRendimentoEmBrancoException() throws ValorEmBrancoException{
		thrown.expect(ValorEmBrancoException.class);
		conta.criarReceita(0);
	}
	
}
