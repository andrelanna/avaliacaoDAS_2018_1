package tests;

import classes.JurosSimples;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import app.ContaCorrente;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class RendimentoTest {

    Rendimento rendimento;

    @Before
    public void init() {
        rendimento = new Rendimento();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 2, 0, 10, -10},
                {1, 1, 5, 3, 2},
                {1, 3, 3, 3, 0}
        });
    }

    @Parameterized.Parameter
    public int agencia;

    @Parameterized.Parameter
    public int conta;

    @Parameterized.Parameter
    public int saldoAbertura;

    @Parameterized.Parameter
    public int valorTransacao;

    @Parameterized.Parameter
    public int saldo;

    @Test
    public void TsTCriacaoRendimento() {
        ContaCorrente = ContaCorrente.criarReceita(valorTransacao);
        assertEquals(saldo, conta.criarReceita(valorTransacao));
    }
}