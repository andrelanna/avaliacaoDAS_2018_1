package allTests;

import static org.junit.Assert.*;

import org.junit.*;

import app.ContaCorrente;
import exceptions.ValorEmBrancoException;

public class TstCriacaoDespesaValorEmBranco {
	
  @Test(expected = ValorEmBrancoException.class)
    public void testeContaCriada() throws ValorEmBrancoException {
		ContaCorrente testando = ContaCorrente.obterContaCorrente(1, 1, 0);
	    assertEquals("Result", 0, testando.criarDespesa(0), 0.1);
    }

}
