package allTests;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.ContaCorrente;
import exceptions.ValorEmBrancoException;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TstCriacaoRendimento {

    public int agencia;
    public int conta;
    public int saldoAbertura;
    public int valorTransacao;
    public int saldo;

    
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
        										{ 1 , 2, 0, 10, 10 },
        										{ 1, 1, 5, 5, 10 },
        										{ 1, 3, -3, 6, 3 }
        									};
        return Arrays.asList(data);
    }

    @Test
    public void testarRendimentos() throws ValorEmBrancoException {
        ContaCorrente testando = ContaCorrente.obterContaCorrente(agencia, conta, saldoAbertura);
        assertEquals("Resultado", saldo, testando.criarReceita(valorTransacao), 0.1);
    }

}