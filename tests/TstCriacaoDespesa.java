package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.ContaCorrente;
import categories.Criacao;
import exceptions.ValorEmBrancoException;

@RunWith(Parameterized.class)
public class TstCriacaoDespesa {

    @Parameters
    public static Collection<Object[]> data() {
	return Arrays.asList(new Object[][] { { 1, 2, 0, 10, -10 }, { 1, 1, 5, 3, 2 }, { 1, 3, 3, 3, 0 } });
    }

    private int fAgencia;

    private int fConta;

    private double fsaldoAbertura;

    private float fValorTransacao;

    private double fsaldo;

    public TstCriacaoDespesa(int fAgencia, int fConta, double fsaldoAbertura, float fValorTransacao, double fsaldo) {
	super();
	this.fAgencia = fAgencia;
	this.fConta = fConta;
	this.fsaldoAbertura = fsaldoAbertura;
	this.fValorTransacao = fValorTransacao;
	this.fsaldo = fsaldo;
    }

    @Test
    @Category(Criacao.class)
    public void test() throws ValorEmBrancoException {
	ContaCorrente ct = ContaCorrente.obterContaCorrente(fAgencia, fConta, fsaldoAbertura);
	ct.criarDespesa(fValorTransacao);
	assertEquals(ct.getSaldo(), fsaldo, 0.05);
    }

}
