package src.tests;

import src.app.ContaCorrente;
import src.exceptions.ValorEmBrancoException;

public class AccountCleaner {
	public static void setSaldo(ContaCorrente conta, int saldoDesejado) throws ValorEmBrancoException {
		if(conta.getSaldo()> saldoDesejado) {
			conta.criarDespesa((int)(conta.getSaldo()-saldoDesejado));
		}else if(conta.getSaldo() < saldoDesejado){
			conta.criarReceita((int)(saldoDesejado - conta.getSaldo()));
		}
	}
}
