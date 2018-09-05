package testes;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import app.ContaCorrente;
import exceptions.ValorEmBrancoException;

public class TstCriacaoRendimentos {

	private ContaCorrente teste;
	private int agencia;
	private int conta;
	private double saldoAbertura;
	private double valorTransacao;
	private double saldo;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
        	{1, 2, 0, 0, 10},
        	{1, 1, 5, 5, 10},
        	{1, 3,-3, 6, 3}
         });
    }
     
	
	public TstCriacaoRendimentos(int agencia,
							  int conta,
							  double saldoAbertura,
							  double valorTransacao,
							  double saldo) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.saldoAbertura = saldoAbertura;
		this.valorTransacao = valorTransacao;
		this.saldo = saldo;
	}
	
	@Before
	public void setUp() {
		this.teste = ContaCorrente.obterContaCorrente(this.agencia, this.conta, this.saldoAbertura);
	}
	
	@Test
	public void test() throws ValorEmBrancoException {
		double valor = this.teste.criarReceita(valorTransacao);
		assertEquals(saldo, valor, 0.001);
	}

}
