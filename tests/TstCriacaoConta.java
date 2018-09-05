package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.experimental.categories.Category;
import org.junit.experimental.categories.ExcludeCategories;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import app.ContaCorrente;
import exceptions.ContaJaCadastradaException;
import exceptions.ValorEmBrancoException;

class TstCriacaoContas {


	@BeforeEach
	void setUp() throws Exception {
		ContaCorrente acc = ContaCorrente.obterContaCorrente(2, 102, 110);
	}
	
	@Category(Criacao.class)
	@Test
	void testObterContaCorrenteNovaConta() {
		ContaCorrente conta  = ContaCorrente.obterContaCorrente(1, 101, 0.0);
		assertNotNull(conta);
		assertEquals(1, conta.getAgencia());
		assertEquals(101, conta.getConta());
		assertEquals(0.0, conta.getSaldo(), 0.1);
	}
	
//	@Rule
//	public ExpectedException thrown = ExpectedException.none();	
//
//	@Category(Excecao.class)
//	@Test
//	void testContaCadastrada() throws ContaJaCadastradaException {
//		ContaCorrente conta  = ContaCorrente.obterContaCorrente(2,102,110);
//		thrown.expect(exceptions.ContaJaCadastradaException.class);
//	}

}

