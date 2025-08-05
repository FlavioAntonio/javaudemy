package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

	public static void cadastrarPessoa() throws SQLException {
		Connection conexao = FabricaConexao.getConnection();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o nome: ");
		String nome = entrada.nextLine();

		String sql = "INSERT INTO pessoas (nome) VALUES(?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);
		stmt.executeUpdate();
		entrada.close();
		stmt.close();
		
	}

}
