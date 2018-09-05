package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
	TstCriacaoContas.class,
	TstCriacaoRendimentos.class,
	TstCriacaoDespesas.class,
	TstCriacaoRendimentosValorEmBranco.class,
	TstCriacaoDespesasValorEmBranco.class,
})

public class AllTests {

}