package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.ContaCorrente;
import exceptions.ValorEmBrancoException;
import tests.categories.Criacao;

@RunWith(Parameterized.class)
@Category(Criacao.class)
public class TstCriacaoRendimentos {

	private int agencia;
	private int conta;
	private double saldoAbertura;
	private float valorTransacao;
	private double saldo;
	
	
	public TstCriacaoRendimentos(int agencia, 
			int conta, double saldoAbertura, float valorTransacao, double saldo) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldoAbertura = saldoAbertura;
		this.valorTransacao = valorTransacao;
		this.saldo = saldo;
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{1, 2, 0, 10, 10},
			{1, 1, 5, 5, 10},
			{1, 3, -3, 6, 3}
		});
	}
	
	@Test
	public void testCriacaoRendimentos() throws ValorEmBrancoException {
		ContaCorrente c = ContaCorrente.pesquisarContaCorrente(agencia, conta);
		
		if(c == null) {
			c = ContaCorrente.obterContaCorrente(agencia, conta, saldoAbertura);
		}
		
		
		assertEquals(saldo, c.criarReceita(valorTransacao) , 0);
	}

}
