package tests;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@SuiteClasses({
	TstCriacaoContas.class,
	TstCriacaoRendimentos.class,
	TstCriacaoRendimentosValorEmBranco.class
})

public class AllTests {

}
