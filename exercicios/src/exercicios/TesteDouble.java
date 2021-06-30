package exercicios;
import java.util.Locale;
import java.util.function.UnaryOperator;

public class TesteDouble {
	public static void main(String[] args) {
		Double teste = 105.0054897;
		
		UnaryOperator<Double>arredondar= a -> Double.parseDouble(String.format(Locale.ENGLISH,"%.2f",a));

		while (teste > 100) {

			System.out.println(arredondar.apply(teste));
			teste += 1;	
		}
	}
}
