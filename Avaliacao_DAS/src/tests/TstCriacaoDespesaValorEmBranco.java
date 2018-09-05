package tests;


import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.ContaCorrente;
import exceptions.ValorEmBrancoException;


@RunWith(Parameterized.class)
public class TstCriacaoDespesaValorEmBranco {
	
	private float valorTransacao;
	
	
	public TstCriacaoDespesaValorEmBranco(float valorTransacao) {
		this.valorTransacao = valorTransacao;
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][]{
			{0},
		});
	}

	@Test(expected = ValorEmBrancoException.class)
	public void test_cria_rendimento_em_branco() throws ValorEmBrancoException {
		ContaCorrente c = ContaCorrente.obterContaCorrente(30, 40, 30);
		c.criarDespesa(valorTransacao);
	}
	
}
