package allTests;

import static org.junit.Assert.*;

import org.junit.*;

import app.ContaCorrente;
import exceptions.ContaJaCadastradaException;

public class TstCriacaoContas {

    @Test
    public void testeContaCriada() {
        ContaCorrente conta = ContaCorrente.obterContaCorrente(1, 1, 0);

        assertNotNull("Conta Corrente não pode ser vazia.", conta);
    }
    
    @Test(expected = ContaJaCadastradaException.class)
    public void testeContaJaCadastrada () throws ContaJaCadastradaException {
        ContaCorrente conta1 = ContaCorrente.obterContaCorrente(1, 1, 0);
        ContaCorrente conta2 = ContaCorrente.obterContaCorrente(1, 1, 0);
        assertEquals(conta2, conta1);
    }

}
