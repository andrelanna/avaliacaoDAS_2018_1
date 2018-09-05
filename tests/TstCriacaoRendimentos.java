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
public class TstCriacaoRendimentos {

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
        	{1, 2, 0, 10, 10},
        	{1, 1, 5, 5, 10},
        	{1, 3, -3, 6, 3},
        	{2, 2, 500, 100, 600},
        	{2, 1, -500, 100, -400},
        	{2, 3, 1, 2, 3},
        	{3, 2, 1000, 10, 1010},
        	{3, 1, 123, 123, 246},
        	{3, 3, 321, 321, 642},
        	{3, 4, 1, 1, 2},
    	});
    }
    
    public TstCriacaoRendimentos(int agencia, int conta, float saldoAbertura, float valorTransacao, float saldo) {
    	this.agencia = agencia;
    	this.conta = conta;
    	this.saldoAbertura = saldoAbertura;
    	this.valorTransacao = valorTransacao;
    	this.saldo = saldo;
    }
    
    @Test
    public void CriacaoRendimentoValido() throws ValorEmBrancoException {
    	this.contaCorrente.criarReceita(this.valorTransacao);
    	assertEquals(this.saldo, this.contaCorrente.getSaldo(), 0);
    }
}
