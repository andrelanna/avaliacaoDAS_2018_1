package testes;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import exceptions.ValorEmBrancoException;

import app.ContaCorrente;
import app.Despesa;

@RunWith(Parameterized.class)
@Category(Criacao.class)
public class TstCriacaoDespesas {
	
	
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 1, 2, 0,  10, -10},
                { 1, 1, 5,  3, 2},
                {1,3, 3, 3, 0}
        });
    }
    
    private final ContaCorrente contacorrente;
    private final int agencia;
    private final int conta;
    private final float saldoAbertura;
    private final float valorTransacao;
    private final double saldo;
    
    public TstCriacaoDespesas( int agencia, int conta, double saldoAbertura, double  valorTransacao, double saldo){
    	this.contacorrente = new ContaCorrente(conta, conta, saldo);
    	this.agencia = agencia;
    	this.conta = conta;
    	this.saldoAbertura = (float) saldoAbertura;
    	this.valorTransacao = (float) valorTransacao;
    	this.saldo = saldo;
    }
    
    @Test
    public void shouldReturnvalorTransacao() throws ValorEmBrancoException{
    	
        float saldoFinal = (float) contacorrente.criarDespesa(valorTransacao);
        assertEquals(saldo, valorTransacao, 0.01);
    }
    

}
