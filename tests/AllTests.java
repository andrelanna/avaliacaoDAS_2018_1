package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ TstCriacaoContas.class, TstCriacaoDespesa.class, TstCriacaoDespesasValorEmBranco.class,
	TstCriacaoRendimento.class, TstCriacaoRendimentosValorEmBranco.class })

public class AllTests {

}
