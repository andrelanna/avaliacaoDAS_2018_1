package tests;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import app.ContaCorrente;
import categories.Excecao;
import exceptions.ValorEmBrancoException;

public class TstCriacaoRendimentosValorEmBranco {

    @Test(expected = ValorEmBrancoException.class)
    @Category(Excecao.class)
    public void receiraComValorEmBranco() throws ValorEmBrancoException {
	// Cria nova conta
	ContaCorrente cc = ContaCorrente.obterContaCorrente(17, 23, 300.0);
	// Realiza uma adição de valor em branco
	cc.criarReceita(0);
    }
}
