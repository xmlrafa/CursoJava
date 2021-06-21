package exercicios;

import java.util.Scanner;

public class exercicio {

		public static void main(String[] args) {
			
			Scanner Entrada = new Scanner(System.in);
			
			System.out.println("===== CALCULADORA DO WIL ====");
			
			System.out.println("Digite o primeiro número: ");
			int Valor1 = Entrada.nextInt();
			System.out.println("Digite o segundo número: ");
			int Valor2 = Entrada.nextInt();
			int resultado = 0;
			System.out.println("Digite qual operação deseja realizar: ");
			String operacao = Entrada.next();
			
			switch (operacao) {
			case "+":
				resultado = Valor1 + Valor2;
				break;
			case "-":
				resultado = Valor1 - Valor2;
				break;
			case "*":
				resultado = Valor1 * Valor2;
				break;
			case "/":
				resultado = Valor1 / Valor2;
				break;
			
			default:
				System.out.println("Você não digitou uma operação válida.");
			}
			System.out.println("O resultado da operação é: " + resultado);
			Entrada.close();
		}
}
