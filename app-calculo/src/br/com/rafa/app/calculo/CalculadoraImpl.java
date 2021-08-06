package br.com.rafa.app.calculo;

import br.com.rafa.app.Calculadora;
import br.com.rafa.app.calculo.interno.OperacoesAritmeticas;
import br.com.rafa.app.logging.Logger;

public class CalculadoraImpl implements Calculadora {
	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		Logger.info("Somando..." );
		return opAritmeticas.soma(nums);
	}
}
