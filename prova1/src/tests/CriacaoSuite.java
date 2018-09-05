package tests;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import categories.Criacao;

@RunWith(Categories.class)
@IncludeCategory(Criacao.class)
@SuiteClasses({TstCriacaoContas.class, TstCriacaoDespesa.class, TstCriacaoRendimento.class})
public class CriacaoSuite {

}
