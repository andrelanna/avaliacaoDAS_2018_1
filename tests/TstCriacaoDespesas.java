package tests;

import static org.junit.Assert.assertEquals;

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
public class TstCriacaoDespesas {

	private ContaCorrente contaCorrente;
	private int agencia;
	private int conta;
	private float saldoAbertura;
	private float valorTransacao;
	private float saldo;
	
	@Before
	public void setUp() {
		this.contaCorrente = ContaCorrente.pesquisarContaCorrente(this.agencia, this.conta);
    	
    	if(this.contaCorrente == null) {
    		this.contaCorrente = ContaCorrente.obterContaCorrente(
    				this.agencia,
    				this.conta,
    				this.saldoAbertura
    		);
    	}
	}
	
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
        	{4, 2, 0, 10, -10},
        	{4, 1, 5, 3, 2},
        	{4, 3, 3, 3, 0},
        	{5, 2, 500, 100, 400},
        	{5, 1, -500, 100, -600},
        	{5, 3, 1, 2, -1},
        	{6, 2, 1000, 10, 990},
        	{6, 1, 123, 122, 1},
        	{6, 3, 321, 323, -2},
        	{6, 4, 1, 1, 0},
    	});
    }
    
    public TstCriacaoDespesas(int agencia, int conta, float saldoAbertura, float valorTransacao, float saldo) {
    	this.agencia = agencia;
    	this.conta = conta;
    	this.saldoAbertura = saldoAbertura;
    	this.valorTransacao = valorTransacao;
    	this.saldo = saldo;
    }
    
    @Test
    public void CriacaoDespesaValida() throws ValorEmBrancoException {
    	this.contaCorrente.criarDespesa(this.valorTransacao);
    	assertEquals(this.saldo, this.contaCorrente.getSaldo(), 0);
    }
	
}
