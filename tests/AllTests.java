package tests;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

// Para rodar categorias específicas, basta utilizar e/ou modificar o trecho abaixo:
// @RunWith(Categories.class)
// @IncludeCategory(Criacao.class)
// @ExcludeCategory(Excecao.class)
@RunWith(Suite.class)
@Suite.SuiteClasses({
	TstCriacaoContas.class,
	TstCriacaoRendimentos.class,
	TstCriacaoRendimentosValorEmBranco.class,
	TstCriacaoDespesas.class,
	TstCriacaoDespesaValorEmBranco.class
})
public class AllTests {

}
