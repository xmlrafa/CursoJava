package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		UnaryOperator<String> maiuscula = m-> m.toUpperCase();
		UnaryOperator<String> primeiraLetra = m-> m.charAt(0)+"";
		UnaryOperator<String> grito = m-> m + "!!!!!  ";
		
		System.out.println("\n\n\n Usando composi��o");
		marcas.stream().map(maiuscula).map(primeiraLetra).map(grito).forEach(print);
		
		
	}
}
