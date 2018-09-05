import org.junit.Test;

public class TstCriacaoDespesaValorEmBranco {



    @Test (expected = ValorEmBrancoException.class)
    public void tstCriacaoDespesaValorEmBrancoException() throws ValorEmBrancoException{
        ContaCorrente contaCorrente = new ContaCorrente(7, 1, 10);
        contaCorrente.criarDespesa(0);
    }

}
