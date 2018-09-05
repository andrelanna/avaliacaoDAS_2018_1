package tests;

import exceptions.ValorEmBrancoException;
import junit.framework.Test;
import app.Receita;

public class TstCriacaoRendimentosValorEmBranco {
	@Test(expected = ValorEmBrancoException.class)
	public void tstCriacaoDespesaValorEmBranco() {
		try {
			Receita r = new Receita(0);
		} catch (ValorEmBrancoException valorEmBrancoException) {
			
		}
	}
}
