import app.ContaCorrente;
import exceptions.ValorEmBrancoException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import java.util.Arrays;
import java.util.Collection;

@Category(Excecao.class)
@RunWith(Parameterized.class)
public class TstCriacaoRendimentos {
	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			    {1, 2, 0, 10, 10},
                {1, 1, 5, 5, 10},
                {1, 3, -3, 6, 3}
		});
	}

	@Parameter
	public int agencia;
	@Parameter(1)
	public int conta;
	@Parameter(2)
	public double saldoAbertura;
	@Parameter(3)
	public float valorTransacao;
	@Parameter(4)
    public double saldo;

	@Test()
	public void testCriaRendimento() throws ValorEmBrancoException {
        ContaCorrente contaCorrente = ContaCorrente.obterContaCorrente(agencia, conta, saldoAbertura);
		Assert.assertEquals(saldo, contaCorrente.criarReceita(valorTransacao), 0);
	}
}