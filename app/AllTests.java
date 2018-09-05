import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Suite;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Suite.class)
@Suite.SuiteClasses({TstCriacaoRendimentos.class, TstCriacaoDespesas.class, TstCriacaoDespesaValorEmBranco.class, TstCriacaoRendimentosValorEmBranco.class})

public class AllTests {

}
