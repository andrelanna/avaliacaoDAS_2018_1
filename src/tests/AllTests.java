package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import test.CompoundInterestParametrizedTest;
import test.CompountInterestExceptionTestCase;
import test.SimpleInterestParametrizedTest;
import test.TSTJuros;

@RunWith(Categories.class)
@IncludeCategory(Criacao.class)
@Suite.SuiteClasses({
	TstCriacaoContas.class,
	TstCriacaoRendimentos.class,
	TstCriacaoDespesas.class
})
@IncludeCategory(Excecao.class)
@Suite.SuiteClasses({
	TstCriacaoDespesaValorEmBranco.class,
	TstCriacaoRendimentosValorEmBranco.class
})
public class AllTests {

}
