package test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import app.ContaCorrente;
import exceptions.ValorEmBrancoException;

@Category(Excecao.class)
public class TstCriacaoRendimentosValorEmBranco {
	
	@Test
	public void testaValorEmBrancoRendimentos() throws ValorEmBrancoException{
		int agencia = 3465;
		int conta = 226;
		double saldo = 2500;
		
		ContaCorrente c = ContaCorrente.obterContaCorrente(agencia, conta, saldo);
		c.criarReceita(0);
	}

}
