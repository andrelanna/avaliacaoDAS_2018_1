package Excecao;

import Categoria.Excecao;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TstCriacaoContas extends Exception {
    ContaCorrente contaCorrente;

    @Before
    public void init(){
        contaCorrente = new ContaCorrente();
    }

    @Category(Excecao.class)
    @Test
    public void criacaoContaTeste(){
        int agencia = 10;
        int conta = 20;
        int saldoAbertura = 30;

        conta.obterContaCorrente(agencia, conta, saldoAbertura);

        Assert.assertEquals(agencia, conta.getAgencia());
        Assert.assertEquals(noConta, conta.getConta());
        Assert.assertEquals(saldo, conta.getSaldoAbertura(), 0.1);
    }
}

