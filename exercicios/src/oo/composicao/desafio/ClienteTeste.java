package oo.composicao.desafio;

import java.util.Scanner;

public class ClienteTeste {
	public static void main(String[] args) {
		System.out.println("Sistema de compras");
		Cliente cliente1 = new Cliente();
		cliente1.nome = "Rafael";
		Scanner Entrada = new Scanner(System.in);
		Compra compra1 = new Compra();
		String continuar = "S";
		double somaCompra = compra1.ValorCompra();
		
		while (continuar.equals("S")) {
			
		
		Item item1 = new Item();
		item1.obterItens();
		item1.obterQuantidade();
		double somaItem = item1.obterValorItens();	
		System.out.println("A soma do valor dos produtos ?: " + somaItem);
				
		
		compra1.adicionarCompra(item1);
		
		cliente1.adicionarCompra(compra1);
		
		somaCompra = compra1.ValorCompra();
		System.out.println("Deseja continuar comprando? s/n");
		continuar = Entrada.next();
		continuar = continuar.toUpperCase();
		} 
		System.out.println(somaCompra + " valor da compra");
		Entrada.close();
	}
}
