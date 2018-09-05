package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TstCriacaoContas.class,
	TstCriacaoDespesas.class,
	TstCriacaoDespesaValorEmBranco.class,
	TstCriacaoRendimentosValorEmBranco.class,
	TstCriacaoRendimentos.class // Vai falhar, não descobri um jeito de deletar
								// as contas já utilizadas...
})
public class AllTests {

}
