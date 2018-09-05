package avaliacaoDAS_2018_1.app;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory({TstCriacaoRendimentos.class, TstCriacaoDespesas.class})
@SuiteClasses({RendimentoTest.class, DespesaTest.class})
public class AllTests {

}
