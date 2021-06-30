package excecao;

import java.util.Scanner;

public class Finally {
	public static void main(String[] args) {
		
		Scanner Entrada = new Scanner(System.in);

		try {
			System.out.println(7 / Entrada.nextInt());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		finally {
			System.out.println("Finalmente...");
			Entrada.close();
		}
		
		System.out.println("Fim!");
	}
}
