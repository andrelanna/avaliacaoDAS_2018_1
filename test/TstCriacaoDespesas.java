package test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.AfterClass;
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

	int agencia;
	int conta;
	double saldoAbertura;
	float valorTransacao;
	double saldo;
	
	public TstCriacaoDespesas (int agencia, int conta, double saldoAbertura, float valorTransacao, double saldo) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldoAbertura = saldoAbertura;
		this.valorTransacao = valorTransacao;
		this.saldo = saldo;
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{2,2,0,10,-10},
			{2,1,5,3,2},
			{2,3,3,3,0}
		});
	}
	
	@Test
	public void testCriacaoDespesas() throws ValorEmBrancoException {
		ContaCorrente c = ContaCorrente.obterContaCorrente(agencia, conta, saldoAbertura);
		assertEquals(saldo, c.criarDespesa(valorTransacao), 0.1);
	}

}
