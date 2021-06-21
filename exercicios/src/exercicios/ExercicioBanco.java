package exercicios;

import java.util.Scanner;

public class ExercicioBanco {
	public static void main(String[] args) {
		int operacao = 0;
		int saldo = 0;
		int saque, deposito, sair;
		System.out.println("====== Banco do Motano =======");
		Scanner Entrada = new Scanner(System.in);
		while (operacao != 4) {
			System.out.println("Selecione as opções \n" + "===== 1 - Saldo ===== \n" + "===== 2 - Saque ===== \n"
					+ "===== 3 - Depósito ===== \n" + "===== 4 - Sair ===== ");
			operacao = Entrada.nextInt();
			if (operacao == 1) {
				System.out.println("Seu saldo é de R$" + saldo);
				System.out.println("\n\n\n");
			} else if (operacao == 2) {
				System.out.println("Informe o valor do Saque:");
				saque = Entrada.nextInt();
				saldo = saldo - saque;
				System.out.println("\n\n\n");
			} else if (operacao == 3) {
				System.out.println("Informe o valor do depósito: ");
				deposito = Entrada.nextInt();
				saldo = saldo + deposito;
				System.out.println("\n\n\n");
			} else {                                           
				System.out.println("Saindo do sistema!");
				System.out.println("\n\n\n");
				break;
			}
		}
		Entrada.close();
	}
}
