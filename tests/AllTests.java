package tests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({TstCriacaoContas.class, TstCriacaoDespesas.class, TstCriacaoDespesaValorEmBranco.class,
	TstCriacaoRendimentos.class, TstCriacaoRendimentosValorEmBranco.class})
public class AllTests {

}
