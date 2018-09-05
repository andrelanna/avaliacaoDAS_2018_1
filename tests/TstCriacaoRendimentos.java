package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.ContaCorrente;
import exceptions.ValorEmBrancoException;

@RunWith(Parameterized.class)
class TstCriacaoRendimentos {

	
	public ContaCorrente conta = ContaCorrente.obterContaCorrente(1, 10, 0.0);
//	@Parameters
//    public static Collection<Object[]> data() {
//        return Arrays.asList(new Object[][] {     
//        	{0.01, 10, 1000, 104.62}  
//           });
//    }
	
	@Category(Criacao.class)
	@Test
	void testCriarReceita() throws ValorEmBrancoException {
		//conta = ContaCorrente.obterContaCorrente(1, 10, 0.0);
		conta.criarReceita(10);
		assertEquals(10,conta.getSaldo(),0.1);
	}

}

