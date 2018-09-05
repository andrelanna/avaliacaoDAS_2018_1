package test;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import test.category.ExcecaoCategory;

@RunWith(Categories.class)
@ExcludeCategory(ExcecaoCategory.class)
@SuiteClasses({
	TstCriacaoConta.class,
	TstCriacaoDespesas.class,
	TstCriacaoRendimentos.class,
	test.parameterized.TstCriacaoDespesas.class,
	test.parameterized.TstCriacaoRendimento.class
})
public class AllTestsCriacaoCategory {

}
