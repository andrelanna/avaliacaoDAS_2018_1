package tests;

import java.util.Arrays;
import java.util.Collection;
 
import org.junit.Test;
import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.ContaCorrente;

import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TstCriacaoDespesas {
   private float valorTransacao;
   private double saldo;
   private ContaCorrente contaCorrente;
	
   public TstCriacaoDespesas(int agencia, int conta, int saldoAbertura, float valorTransacao, double saldo) {
      this.saldo = saldo;
      this.valorTransacao = valorTransacao;
      this.contaCorrente = ContaCorrente.obterContaCorrente(agencia, conta, saldoAbertura);
   }

   @Parameterized.Parameters
   public static Collection<Object[]> parameters() {
      return Arrays.asList(new Object[][] {
         { 1, 2, 0, 10, -10 },
         { 1, 1, 5, 3, 2 },
         { 1, 3, 3, 3, 0 }
      });
   }

   @Test
   public void testCriarDespesa() {
      assertEquals(this.saldo, this.contaCorrente.criarDespesa(this.valorTransacao), 0.01);
   }
}
