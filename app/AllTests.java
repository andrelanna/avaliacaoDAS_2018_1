package app;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(Excecao.class)
@SuiteClasses({
	TstCriacaoContas.class, 
	TstCriacaoRendimentos.class,
	TstCriacaoDespesas.class,
	TstCricaoContaJaCadastrada.class, 
	TstCriacaoRendimentosEmBranco.class,
	TstCriacaoDespesasEmBrancoTest.class
	})
public class AllTests {

}
