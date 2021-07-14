package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {
	public static void main(String[] args) throws SQLException {
Scanner entrada = new Scanner(System.in);
		
		Connection conexao = FabricaConexao.getConexao();
		String select = "SELECT * FROM pessoas WHERE codigo = ?";
		String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		
		System.out.println("Informe o código da pessoa: ");
		int valor = entrada.nextInt();
		PreparedStatement stmt = conexao.prepareStatement(select);
		stmt.setInt(1, valor);
		ResultSet resultado = stmt.executeQuery();

		if (resultado.next()) {
			Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));
			System.out.println("O nome atual da pessoa é: " + p.getNome());
			entrada.nextLine();
			
			System.out.println("Informe o novo nome: ");
			String novoNome = entrada.nextLine();
			
			stmt = conexao.prepareStatement(update);
			stmt.setString(1,  novoNome);
			stmt.setInt(2, valor);
			stmt.execute();
			
			System.out.println("Pessoa alterada com sucesso! ");
			
		}else {
			System.out.println("pessoa nao encontrada");
		}

		stmt.close();
		conexao.close();
		entrada.close();
	}
}
