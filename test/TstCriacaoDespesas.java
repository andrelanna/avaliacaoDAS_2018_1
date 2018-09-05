import app.ContaCorrente;
import exceptions.ValorEmBrancoException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@Category(Criacao.class)
@RunWith(Parameterized.class)
public class TstCriacaoDespesas {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {1, 2, 0, 10, -10},
                {1, 1, 5, 3, 2},
                {1, 3, 3, 3, 0}
        });
    }

    @Parameterized.Parameter
    public int agencia;
    @Parameterized.Parameter(1)
    public int conta;
    @Parameterized.Parameter(2)
    public double saldoAbertura;
    @Parameterized.Parameter(3)
    public float valorTransacao;
    @Parameterized.Parameter(4)
    public double saldo;

    @Test()
    public void testCriaRendimento() throws ValorEmBrancoException {
        ContaCorrente contaCorrente = ContaCorrente.obterContaCorrente(agencia, conta, saldoAbertura);
        Assert.assertEquals(saldo, contaCorrente.criarDespesa(valorTransacao), 0);
    }
}