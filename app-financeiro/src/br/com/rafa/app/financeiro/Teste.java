package br.com.rafa.app.financeiro;

import java.util.ServiceLoader;

import br.com.rafa.app.Calculadora;


public class Teste {
	public static void main(String[] args) {
		Calculadora calc = ServiceLoader.load(Calculadora.class).findFirst().get();
		System.out.println(calc.soma(2, 3, 4));

	}
}
