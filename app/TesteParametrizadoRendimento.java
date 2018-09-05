import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class TesteParametrizadoRendimento {

    private TstCriacaoRendimento tstCriacaoRendimento = new TstCriacaoRendimento();

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 2, 0, 10, 10}, {1, 1, 5, 10}, {1, 3, -3, 6, 3},
        });
    }

    @Parameterized.Parameter
    public int agencia;

    @Parameterized.Parameter(1)
    public int conta;

    @Parameterized.Parameter(2)
    public double saldoAbertura;

    @Parameterized.Parameter(3)
    public double valorTrans;

    @Parameterized.Parameter(4)
    public double saldo;

    @Test
    public void calculaRendimentoTest() {
        assert(saldo==tstCriacaoRendimento.calculaRendimento(int agencia, int conta, double saldoAbertura, double valorTrans));
    }
}