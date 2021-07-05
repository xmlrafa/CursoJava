package br.com.projetoCurso.cminado;

import br.com.projetoCurso.cminado.modelo.Tabuleiro;
import br.com.projetoCurso.cminado.visao.TabuleiroConsole;

public class Aplicacao {
	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		
		new TabuleiroConsole(tabuleiro);
			}
}
