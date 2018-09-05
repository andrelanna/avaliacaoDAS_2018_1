package Parametrizado;

import Categoria.Criacao;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class TstCriacaoDespesas {

    ContaCorrente contaCorrente;

    @Before
    public void init() {
       contaCorrente = new ContaCorrente();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> TesteCases() {
        return Arrays.asList(new Object[][]{
                {1, 2, 0, 10, -10},
                {1,1, 5, 3, 2},
                {1, 3, 3, 3, 0}
        });
    }

    @Parameterized.Parameter(0)
    public double agencia;

    @Parameterized.Parameter(1)
    public double conta;

    @Parameterized.Parameter(2)
    public double saldoAbertura;

    @Parameterized.Parameter(3)
    public double valorTransacao;

    @Parameterized.Parameter(4)
    public double saldo;

    private static final double DELTA = 0.01;

    @Test
    @Category(Criacao.class)
    public void criacaoRendimentoTeste() throws ValorEmBrancoException {
        Assert.assertEquals(saldo, contaCorrente.criarDespesas(valorTransacao), 0);
    }
}
