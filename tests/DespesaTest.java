package tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import app.ContaCorrente;

@RunWith(Parameterized.class)
public class DespesaTest {

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
    public double saldoAbertura;

    @Parameterized.Parameter
    public double valorTransacao;

    @Parameterized.Parameter
    public double saldo;

    private double erro = 0.01;

    @Test
    public void TsTCriacaoDespesa() {
        ContaCorrente conta = ContaCorrente(agencia, conta, saldo);
        assertEquals(saldo, conta.criarDespesa(valorTransacao));
    }
}