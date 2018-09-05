package src.tests;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)

// Categories Available
@IncludeCategory({ 
	Excecao.class, 
	Criacao.class 
})

@Suite.SuiteClasses({ 
	TstCriacaoContas.class,
	TstCriacaoDespesas.class,
	TstCriacaoRendimentos.class,
	TstCriacaoDespesaValorEmBranco.class,
	TstCriacaoRendimentosValorEmBranco.class 
})

public class AllTests {

}