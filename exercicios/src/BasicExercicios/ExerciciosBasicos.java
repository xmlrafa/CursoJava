package BasicExercicios;

import java.util.Scanner;

public class ExerciciosBasicos {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		 
		System.out.println("Qual a sua idade?");
		int idade = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Qual o seu nome?");
		String nome = teclado.nextLine();
		System.out.println("Qual o seu sobrenome?");
		String sobrenome = teclado.nextLine();
		 
		teclado.close();
	}
}
