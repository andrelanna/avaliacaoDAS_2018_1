package allTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        TstCriacaoContas.class,
        TstCriacaoDespesa.class,
        TstCriacaoRendimento.class,
        TstCriacaoDespesaValorEmBranco.class,
        TstCriacaoRendimentoValorEmBranco.class,
        })

public class AllTests {

}