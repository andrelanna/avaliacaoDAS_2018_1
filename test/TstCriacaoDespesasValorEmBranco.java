import app.ContaCorrente;
import exceptions.ContaJaCadastradaException;
import exceptions.ValorEmBrancoException;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(Excecao.class)
public class TstCriacaoDespesasValorEmBranco {

    @Test(expected = ContaJaCadastradaException.class)
    public void testCriacaoDespesasValorEmBranco() throws ValorEmBrancoException {
        ContaCorrente contaCorrente = ContaCorrente.obterContaCorrente(1,2, 0.0);
        float value = 0.0f;
        contaCorrente.criarReceita(value);

    }

}

