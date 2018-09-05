package test;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import test.category.CriacaoCategory;

@RunWith(Categories.class)
@ExcludeCategory(CriacaoCategory.class)
@SuiteClasses({
	TstCriacaoConta.class,
	TstCriacaoDespesas.class,
	TstCriacaoRendimentos.class,
	test.parameterized.TstCriacaoDespesas.class,
	test.parameterized.TstCriacaoRendimento.class
})
public class AllTestsExceptionCategory {

}
