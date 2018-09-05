package teste;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import app.ContaCorrente;
import exceptions.ValorEmBrancoException;

@RunWith(Parameterized.class)
@Category(Criacao.class)
public class TesteRendimento {

	private int agencia;
	private int conta;
	private double saldo;
	private float valorTransacao;
	private double result;
	public TesteRendimento(int agencia, int conta, double saldo, float valorTransacao, double result) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.valorTransacao = valorTransacao;
		this.result = result;
	}

	@Parameterized.Parameters
	public static Collection params() {
		return Arrays.asList(new Object[][] {
			{1,2,0,10,10},
			{1,1,5,5,10},
			{1,3,-3,6,3},
		});
	}
	@Test
	public void testeRendimento() throws ValorEmBrancoException {
		ContaCorrente conta = new ContaCorrente(this.agencia,this.conta,this.saldo);
		double result = conta.criarReceita(valorTransacao);
		assertEquals(this.result,result,0.00);
	}
	
}
