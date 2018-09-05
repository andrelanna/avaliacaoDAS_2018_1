package test;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;

import app.ContaCorrente;
import exceptions.ContaJaCadastradaException;

@Category(Criacao.class)
public class TstCriacaoContas {
	
	@Test
	public void testContaJaCadastradaException()  {
		int agencia = 3465;
		int conta = 226;
		double saldo = 2500;
		
		ContaCorrente c = ContaCorrente.obterContaCorrente(agencia, conta, saldo);
		
	}
	
	
	@Test
	public void testaCriacaoContaContaJaExiste() throws ContaJaCadastradaException{
		int agencia = 3465;
		int conta = 226;
		
		ContaCorrente c = ContaCorrente.pesquisarContaCorrente(agencia, conta);
				
		
	}

}
