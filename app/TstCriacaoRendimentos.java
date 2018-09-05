import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TstCriacaoRendimentos {

    private ContaCorrente contaCorrente;
    private int agencia;
    private int conta;
    private double saldo;
    private float valorTransacao;
    private double saldofinal;

        @Parameterized.Parameters
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][]{
                    //agencia, conta, saldoAb, valorTrans, = saldo
                    {1, 2, 0, 10, 10},
                    {1, 1, 5, 5, 10},
                    {1, 3, -3, 6, 3}

            });
        }


    public TstCriacaoRendimentos(int agencia, int conta, double saldo, float valorTransacao, double saldofinal) {
        super();
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.valorTransacao = valorTransacao;
        this.saldofinal = saldofinal;
    }

    @Before
    public void setUp() {
        this.contaCorrente = new ContaCorrente(this.agencia, this.conta, this.saldo);
    }

        @Test
        public void tstCriacaoRendimento() throws ContaJaCadastradaException, ValorEmBrancoException{
            double saldotransacao = this.contaCorrente.criarReceita(valorTransacao);
            assertEquals(this.saldofinal, saldotransacao, 0.1);
            }

}
