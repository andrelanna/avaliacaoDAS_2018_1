package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	TstCriacaoConta.class,
	TstCriacaoDespesas.class,
	TstCriacaoRendimentos.class,
	test.parameterized.TstCriacaoDespesas.class,
	test.parameterized.TstCriacaoRendimento.class
})
public class AllTests {

}
