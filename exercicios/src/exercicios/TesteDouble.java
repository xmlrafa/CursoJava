package exercicios;
import java.util.Locale;
import java.util.function.UnaryOperator;

public class TesteDouble {
	public static void main(String[] args) {
		Double teste = 105.0054897;
		
		UnaryOperator<Double>arredondar= a -> Double.parseDouble(String.format("%.2f",a));

		System.out.println(arredondar.apply(teste));
		
	}
}
