package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	List<Item> Compra = new ArrayList<Item>();
	Item itens = new Item();
	
	public void adicionarCompra(Item item) {
		Compra.add(item);
		}
	
	double ValorCompra() {
		double valorCompra = 0;
		for (Item item : Compra) {
			double somaItens = item.obterValorItens();
			valorCompra += somaItens;
		}
		return valorCompra;
	}
	
	
}
