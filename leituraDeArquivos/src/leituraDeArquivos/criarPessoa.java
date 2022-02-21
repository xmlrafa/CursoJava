package leituraDeArquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class criarPessoa {
	public static void main(String[] args) throws IOException {
		File caminho = new File("C:\\Users\\Rafa\\Desktop\\Curso-Java\\CursoJava\\leituraDeArquivos\\src\\arquivo.txt");
		
		FileWriter escrever = new FileWriter(caminho);
		Scanner entrada = new Scanner(System.in);
		List<Object> pessoas = new ArrayList<Object>();
		Pessoa pessoa = new Pessoa();
		System.out.println("Infome quantos registros você quer adicionar \n");
		int contador = entrada.nextInt();
		

		for (int i = 0; i < contador ; i++) {
			System.out.println("informe o nome:");
			pessoa.setNome(entrada.next());
			
			System.out.println("informe a idade:");
			pessoa.setIdade(entrada.nextInt());
			
			System.out.println("informe o email:");
			pessoa.setEmail(entrada.next());
			
			pessoas.add(pessoa.getNome()+";" + pessoa.getEmail() +";"+ pessoa.getIdade()+"\n");
			}
		
		for (Object p : pessoas) {
			escrever.write(p.toString());
		}
		

		escrever.close();
		entrada.close();
	}
}
