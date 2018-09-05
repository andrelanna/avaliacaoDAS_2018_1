package tests;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import exceptions.ValorEmBrancoException;

import app.ContaCorrente;
import app.Despesa;
import app.Receita;

@RunWith(Parameterized.class)
public class TstCriacaoRendimentos extends TestCase{
	
	@Parameters
	public static Collection<Object[]> rendimentos() {
        return Arrays.asList(new Object[][] {
                 {1,2,0,10,10},
                 {1,1,5,5,10},
                 {1,3,-3,6,3}});
    }
	
	private int agencia;
	private int conta;
	private double saldo;
	private double saldoResultante;
	private double valorTransicao;
	
	public TstCriacaoRendimentos(int agencia,int conta,double saldoResultante,double valorTransicao,double saldo) {
		
		this.saldo = saldo;
		this.agencia = agencia;
		this.conta = conta;
		this.saldoResultante = saldoResultante;
		this.valorTransicao = valorTransicao;
	}
	
	@Test
	public void testRendimentos()  {
				
		assertEquals(saldo, ContaCorrente.obterRendimentos(agencia, conta, saldoResultante, valorTransicao, saldo));
	}
}
