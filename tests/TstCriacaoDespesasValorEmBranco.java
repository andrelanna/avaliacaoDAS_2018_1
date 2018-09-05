package tests;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import app.ContaCorrente;
import categories.Excecao;
import exceptions.ValorEmBrancoException;

public class TstCriacaoDespesasValorEmBranco {

    @Test(expected = ValorEmBrancoException.class)
    @Category(Excecao.class)
    public void receiraComValorEmBranco() throws ValorEmBrancoException {
	// Cria nova conta
	ContaCorrente cc = ContaCorrente.obterContaCorrente(4, 8, 300.0);
	// Realiza uma despesa de valor em branco
	cc.criarDespesa(0);
    }
}
