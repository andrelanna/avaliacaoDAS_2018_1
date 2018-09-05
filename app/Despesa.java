package app;

import exceptions.ValorEmBrancoException;
import exceptions.ValorNegativoException;

public class Despesa {
	double valorTransacao;

	public Despesa(double valorTransacao) throws ValorEmBrancoException, ValorNegativoException {
		if (valorTransacao==0) throw new ValorEmBrancoException();
		if (valorTransacao<0) throw new ValorNegativoException();
		this.valorTransacao = valorTransacao;
	}

	public double getValorTransacao() {
		return valorTransacao;
	}
}
