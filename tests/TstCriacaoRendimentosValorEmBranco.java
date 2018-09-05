package tests;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import app.ContaCorrente;
import exceptions.ValorEmBrancoException;;

public class TstCriacaoRendimentosValorEmBranco {

	private ContaCorrente contaCorrente;
	
	@Before
	public void setUp() {
		this.contaCorrente = ContaCorrente.obterContaCorrente(1, 123457, 500);
	}
	
	@Category(Excecao.class)
	@Test(expected = ValorEmBrancoException.class)
	public void CriacaoRendimentoComValorEmBranco( ) throws ValorEmBrancoException {
		assertNotNull("A conta não existe", this.contaCorrente);
		
		this.contaCorrente.criarReceita(0);
	}
	
}
