import app.ContaCorrente;
import exceptions.ContaJaCadastradaException;
import org.junit.Test;
import org.junit.Assert;
import org.junit.experimental.categories.Category;

@Category(Excecao.class)
public class TstCriacaoContas {

    @Test
    public void testCadastradaConta() {
        ContaCorrente contaCorrente = ContaCorrente.obterContaCorrente(1,2, 0.0);
        int agencia = contaCorrente.getAgencia();
        int conta = contaCorrente.getConta();
        double saldo = contaCorrente.getSaldo();

        Assert.assertEquals(agencia, 1);
        Assert.assertEquals(conta, 2);
        Assert.assertEquals(saldo, 0.0, 0);
    }


    @Test(expected = ContaJaCadastradaException.class)
    public void testContaJaCadastrada() throws ContaJaCadastradaException {
        ContaCorrente.obterContaCorrente(1,2, 0.0);
        ContaCorrente.obterContaCorrente(1,2, 0.0);
    }

}

