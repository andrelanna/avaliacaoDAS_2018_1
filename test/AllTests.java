package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TstCriacaoContas.class, TstCriacaoRendimentos.class, TstCriacaoDespesas.class, TstCriacaoRendimentosValorEmBranco.class, TstCriacaoDespesaValorEmBranco.class})
public class AllTests {

}
