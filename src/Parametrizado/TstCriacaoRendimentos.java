package Parametrizado;

import Categoria.Criacao;
import Excecao.TstCriacaoContas;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class TstCriacaoRendimentos {
    ContaCorrente contaCorrente;

    @Before
    public void init() {
       contaCorrente = new ContaCorrente();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> TesteCases() {
        return Arrays.asList(new Object[][]{
                {1, 2, 0, 10, 10},
                {1,1, 5, 5, 10},
                {1, 3, -3, 6, 3},
                {1, 3, 5, 5, 11}
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
    public void criacaoRendimentoTeste() throws ValorEmBrancoException, TstCriacaoContas {
        Assert.assertEquals(saldo, contaCorrente.criarReceita(valorTransacao), 0);
    }
}
