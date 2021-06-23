package lambdas;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {
		Produto produto = new Produto("Ipad", 3235.89, 0.13);
		Function<Produto, Double>precoFinal = p ->  p.preco * (1-p.desconto);
		UnaryOperator<Double> impostoMunicipal= i -> i >= 2500 ? i * 1.085: i;
		UnaryOperator<Double>frete= f -> f >= 3000.00 ? f + 100: f + 50;
		UnaryOperator<Double>arredondar= a -> Double.parseDouble(String.format(Locale.ENGLISH,"%.2f",a));
		Function<Double, String>formatar=f -> ("R$"+f).replace(".", ",");
		
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(produto);
		
		System.out.println("O preço final é "+ preco);
		
	}
}
