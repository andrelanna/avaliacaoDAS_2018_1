package test;

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

@Category(Criacao.class)
@RunWith(Parameterized.class)
public class TstCriacaoDespesa {

	private ContaCorrente cc;
	private int agencia;
	private int conta;
	private double saldoAbertura;
	private double valorTransacao;
	private double saldo;
	
   @Parameters
   public static Collection<Object[]> data() {
       return Arrays.asList(new Object[][] {     
       	{1, 2, 0, 10, -10},
       	{1, 1, 5, 3, 2}, 
       	{1, 3, 3, 3, 0}
        });
   }
   
   public TstCriacaoDespesa(int agencia, int conta, double saldoAbertura, double valorTransacao, double saldo) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.saldoAbertura = saldoAbertura;
		this.valorTransacao = valorTransacao;
		this.saldo = saldo;
	}
   
	@Before
	public void setUp() {
		this.cc = new ContaCorrente(this.agencia, this.conta, this.saldoAbertura);
	}
	
	@Test
	public void testDespesa() throws ValorEmBrancoException {
		double valor = this.cc.criarDespesa(valorTransacao);
		assertEquals(this.saldo, valor, 0.01);
	}
	

}
