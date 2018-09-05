package Excecao;

import Categoria.Excecao;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TstCriacaoDespesaValorEmBranco {
    ContaCorrente contaCorrente;

    @Before
    public void init(){
        contaCorrente = new ContaCorrente();
    }

    @Category(Excecao.class)
    @Test
    public void criacaoContaTeste(){
        int valorTransferencia = 0;
        int saldo = 10;

        Assert.assertEquals(saldo, conta.criarDespesa(valorTransferencia), 0.01);
    }
}
