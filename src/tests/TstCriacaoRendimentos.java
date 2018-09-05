package tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.ContaCorrente;
import exceptions.ValorEmBrancoException;

@RunWith(Parameterized.class)
@Category(Criacao.class)
public class TstCriacaoRendimentos {
	private ContaCorrente contaCorrente;
	private int agencia, conta;
	private double saldoAbertura, saldo;
	private float valorTransacao;
	
	public TstCriacaoRendimentos(int agencia, int conta, double saldoAbertura, float valorTransacao, double saldo) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldoAbertura = saldoAbertura;
		this.valorTransacao = valorTransacao;
		this.saldo = saldo;
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{1,2,0,10,10},
			{1,1,5,5,10},
			{1,3,-3,6,3},
		});
	}
	
	@Before
	public void setUp() {
		this.contaCorrente = ContaCorrente.obterContaCorrente(this.agencia, this.conta, this.saldoAbertura);
	}
	
	@Test
	public void test() throws ValorEmBrancoException {
		double valor = this.contaCorrente.criarReceita(this.valorTransacao);
		System.out.println(valor);
		assertEquals(this.saldo, valor, 0.1);
	}

}
