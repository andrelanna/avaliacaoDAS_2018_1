package testes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestCriacaoDespesas.class, TestCriacaoRendimentosEmBranco.class, TstCriacaoContas.class,
		TstCriacaoDespesaValorEmBranco.class, TstCriacaoRendimentos.class })
public class AllTests {

}
