package tests;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import categories.Excecao;

@RunWith(Categories.class)
@IncludeCategory(Excecao.class)
@SuiteClasses({TstCriacaoContas.class, TstCriacaoDespesaEmBranco.class, TstCriacaoRendimentosValorEmBranco.class})
public class ExcecaoSuite {

}
