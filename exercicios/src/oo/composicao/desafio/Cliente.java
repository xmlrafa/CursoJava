package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
	String nome;
	ArrayList<Compra> compras = new ArrayList<Compra>();
	public void adicionarCompra(Compra compra) {
		compras.add(compra);
		}
	
}
