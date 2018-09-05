package teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TesteDespesa.class,
	TesteRendimento.class,
	TesteContaCorrente.class,
	TesteCriacaoContaException.class,
	TesteCriacaoRendimentoValorEmBrancoExcecao.class,
	TesteCriacaoDespesaValorEmBranco.class
})
public class AllTests {

}
