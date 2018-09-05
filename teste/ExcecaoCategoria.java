package teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(Excecao.class)
@SuiteClasses({
	TesteCriacaoContaException.class,
	TesteCriacaoRendimentoValorEmBrancoExcecao.class,
	TesteCriacaoDespesaValorEmBranco.class
})
public class ExcecaoCategoria {

}
