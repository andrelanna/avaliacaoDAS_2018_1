package tests;

import java.util.Arrays;
import java.util.Collection;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.ContaCorrente;

@RunWith(Parameterized.class)
public class TstCriacaoDespesas extends TestCase{

	@Parameters
	public static Collection<Object[]> rendimentos() {
        return Arrays.asList(new Object[][] {
                 {1,2,0,10,-10},
                 {1,1,5,3,2},
                 {1,3,3,3,0}});
    }
	
	private int agencia;
	private int conta;
	private double saldo;
	private double saldoResultante;
	private double valorTransicao;
	
	public TstCriacaoDespesas(int agencia,int conta,double saldoResultante,double valorTransicao,double saldo) {
		
		this.saldo = saldo;
		this.agencia = agencia;
		this.conta = conta;
		this.saldoResultante = saldoResultante;
		this.valorTransicao = valorTransicao;
	}
	
	@Test
	public void testDespesas()  {
				
		assertEquals(saldo, ContaCorrente.obterDespesas(agencia, conta, saldoResultante, valorTransicao, saldo));
	}
}
