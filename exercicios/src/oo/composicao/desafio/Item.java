package oo.composicao.desafio;

import java.util.Scanner;

public class Item {
	int quantidade;	
	Scanner Entrada = new Scanner(System.in);
	Produto produto = new Produto();
	
	public int obterQuantidade() {
		System.out.println("Informe a quantidade do produto: ");
		int qtd = Entrada.nextInt();
		quantidade = qtd;
		return qtd;
		
	}
	public void obterItens() {
		System.out.println("Informe o Produto: ");
		produto.nome = Entrada.next();
		System.out.println("Informe o preço do produto: ");
		produto.preco = Entrada.nextDouble();
		
	}
	
	public double obterValorItens() {
		double soma=0;
		for (int i = 0; i < quantidade; i++) {
			soma += produto.preco;
		}
		return soma;
	}
	
	
}
