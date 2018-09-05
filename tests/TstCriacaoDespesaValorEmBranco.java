package tests;

import exceptions.ValorEmBrancoException;
import junit.framework.Test;
import app.Despesa;


public class TstCriacaoDespesaValorEmBranco {
	@Test(expected = ValorEmBrancoException.class)
	public void tstCriacaoDespesaValorEmBranco() {
		try {
			Despesa d = new Despesa(0);
		} catch (ValorEmBrancoException valorEmBrancoException) {
			
		}
	}
}