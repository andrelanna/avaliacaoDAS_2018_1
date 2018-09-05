package tests;

import org.junit.FixMethodOrder;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import tests.categories.Criacao;
import tests.categories.Excecao;

@RunWith(Categories.class)
//@IncludeCategory(Excecao.class)
@SuiteClasses({
	TstCriacaoContas.class,
	TstCriacaoRendimentos.class,
	TstCriacaoRendimentosValorEmBranco.class,
	TstCriacaoDespesas.class,
	TstCriacaoDespesaValorEmBranco.class
})

public class AllTests {

}
