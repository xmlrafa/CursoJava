package testeSave;

import java.util.Scanner;

public class Executar {
	public static void main(String[] args) {
		funcionario func = new funcionario();
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			func.setIdFuncionario(i + 1);
			
			System.out.println("Informe o nome do funcion�rio "+ (i + 1));
			func.setNomeFuncionario(entrada.nextLine());
			
			System.out.println("Informe o rg do funcion�rio "+ (i + 1));
			func.setRgFuncionario(entrada.nextLine());
			
			System.out.println("Informe a data de nasc do funcion�rio "+ (i + 1));
			func.setDataNascimentoFuncionario(entrada.nextLine());
			
			System.out.println("Informe o endere�o do funcion�rio "+ (i + 1));
			func.setEnderecoFuncionario(entrada.nextLine());
			
			func.funcionarios.add(func);
		}
		
		System.out.println(func.funcionarios.get(1).nomeFuncionario);
		
		entrada.close();
		
	}
}
