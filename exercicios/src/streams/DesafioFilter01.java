package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter01 {
	public static void main(String[] args) {
		Encomendas E1 = new Encomendas("Calca", "Em construção", "Rafa");
		Encomendas E2 = new Encomendas("Blusa", "A caminho", "Isa");
		Encomendas E3 = new Encomendas("Calca", "A caminho", "Mari");
		Encomendas E4 = new Encomendas("Camisa", "Em construção", "Roberto");
		Encomendas E5 = new Encomendas("Blusa", "A caminho", "Wil");
		Encomendas E6 = new Encomendas("Blusa", "Em Análise", "Natalia");
		Encomendas E7 = new Encomendas("Calca", "A caminho", "Raissa");
		Encomendas E8 = new Encomendas("Camisa", "Em construção", "Marcos");

//		Predicate<Encomendas> emAnalise = s -> s.statusEncomenda == "Em Análise";
//		Predicate<Encomendas> emConstrucao = s -> s.statusEncomenda == "Em construção";
		Predicate<Encomendas> aCaminho = s -> s.statusEncomenda == "A caminho";

		Function<Encomendas, String> Resultado = r -> "O(s) pedido(s): " + r.nomeProduto + " de " + r.nomeCliente
				+ " Está(ão)" + r.statusEncomenda;

		List<Encomendas> encomendas = Arrays.asList(E1, E2, E3, E4, E5, E6, E7, E8);
//		encomendas.stream().filter(emAnalise).map(Resultado).forEach(System.out::println);
//		encomendas.stream().filter(emConstrucao).map(Resultado).forEach(System.out::println);
//		encomendas.stream().filter(aCaminho).map(Resultado).forEach(System.out::println);
//		
		encomendas.stream().filter(aCaminho).filter(s -> s.nomeProduto == "Blusa").map(Resultado)
				.forEach(System.out::println);
	}
}
