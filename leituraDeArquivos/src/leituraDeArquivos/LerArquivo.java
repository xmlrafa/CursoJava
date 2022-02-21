package leituraDeArquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivo {
	public static void main(String[] args) throws IOException {
		FileInputStream entrada = new FileInputStream(new File("C:\\Users\\Rafa\\Desktop\\Curso-Java\\CursoJava\\leituraDeArquivos\\src\\arquivo.txt"));
		Scanner lerArquivo = new Scanner(entrada, "UTF-8");
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		while (lerArquivo.hasNext()) {
			String Linha = lerArquivo.nextLine();
			if (Linha != null && !Linha.isEmpty()) {
				String[] dados = Linha.split("\\;");
				Pessoa pessoa = new Pessoa();
				pessoa.setNome(dados[0]);
				pessoa.setEmail(dados[1]);
				pessoa.setIdade(Integer.parseInt(dados[2]));
			
				pessoas.add(pessoa);
			}
		}
		
		lerArquivo.close();
		entrada.close();
	}
}
