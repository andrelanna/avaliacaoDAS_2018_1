package test;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(Categoria.class)
@SuiteClasses({TstCriacoContas.class, TstCriacaoRendimentosValorEmBranco.class, TstCriacaoDespesasValorEmBranco.class})

public class CategoriaTests {

}
