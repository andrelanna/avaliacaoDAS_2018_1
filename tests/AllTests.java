package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(org.junit.runners.Suite.class)
@Suite.SuiteClasses({
    DespesaTest.class,
    RendimentoTest.class,
    TsTCriacaoDespesaValorEmBranco.class,
    TsTCriacaoRendimentoValorEmBranco.class
})

public class AllTests {
}