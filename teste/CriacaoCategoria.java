package teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(Criacao.class)
@SuiteClasses({
	TesteDespesa.class,
	TesteRendimento.class,
	TesteContaCorrente.class
})
public class CriacaoCategoria {

	
}
