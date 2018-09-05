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
public class TstCriacaoDespesas {

	private ContaCorrente contaCorrente2;
	private int agencia, conta;
	private double saldoAbertura, saldo;
	private float valorTransacao;
	
	public TstCriacaoDespesas(int agencia, int conta, double saldoAbertura, float valorTransacao, double saldo) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldoAbertura = saldoAbertura;
		this.valorTransacao = valorTransacao;
		this.saldo = saldo;
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{1,2,0,10,-10},
			{1,1,5,3,2},
			{1,3,3,3,0},
		});
	}
	
	@Before
	public void setUp() {
		this.contaCorrente2 = ContaCorrente.obterContaCorrente(this.agencia, this.conta, this.saldoAbertura);
	}
	
	@Test
	public void test() throws ValorEmBrancoException {
		double valor = this.contaCorrente2.criarDespesa(this.valorTransacao);
		System.out.println(valor);
		assertEquals(this.saldo, valor, 0.1);
	}

}
