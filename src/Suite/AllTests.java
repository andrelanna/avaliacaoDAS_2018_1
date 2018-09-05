package Suite;

import Categoria.Criacao;
import Excecao.TstCriacaoContas;
import Excecao.TstCriacaoRendimentosValorEmBranco;
import Parametrizado.TstCriacaoDespesas;
import Parametrizado.TstCriacaoRendimentos;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//@RunWith(Categories.class)
@RunWith(Suite.class)
//@Categories.IncludeCategory(Criacao.class)
@Suite.SuiteClasses({   TstCriacaoRendimentos.class,
                        TstCriacaoDespesas.class,
                        TstCriacaoContas.class,
                        TstCriacaoRendimentosValorEmBranco.class,
                        TstCriacaoDespesaValorEmBranco.class})
public class AllTests{

}
