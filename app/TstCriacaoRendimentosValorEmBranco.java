import org.junit.Test;

public class TstCriacaoRendimentosValorEmBranco {

    @Test(expected = ValorEmBrancoException.class)
    public void tstCriacaoRendimentoValorEmBrancoException() throws ValorEmBrancoException{
        ContaCorrente contaCorrente = new ContaCorrente(7, 1, 10);
        contaCorrente.criarReceita(0);
    }
}
