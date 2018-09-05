package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;



@RunWith(Suite.class)
@SuiteClasses({
	TstCriacaoContas.class,
	TstCriacaoDespesas.class,
	TstCriacaoDespesasValorEmBranco.class,
	TstCriacaoRendimentos.class,
	TstCriacaoRendimentosValorEmBranco.class
})


public class AllTests {
	
}
