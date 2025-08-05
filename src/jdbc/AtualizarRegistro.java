package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtualizarRegistro {
	public static void atualizarPessoa() throws SQLException {
		Connection conexao = FabricaConexao.getConnection();
		String sql = "SELECT * FROM pessoas";
		String sqlUpdate = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

		Statement stmt = conexao.createStatement();
		ResultSet resultado = stmt.executeQuery(sql);
		List<Pessoa> pessoas = new ArrayList<>();

		while (resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}

		System.out.println("\nLista de Pessoas: ");
		for (Pessoa p : pessoas) {
			System.out.println(p.getCodigo() + " == " + p.getNome());
		}
		
		Scanner entrada = new Scanner(System.in);
			System.out.print("Digite o ID do nome que deseja atualizar: ");
			int id = Integer.parseInt(entrada.nextLine());

				System.out.print("Digite o novo nome ?");
				String novoNome = entrada.nextLine();
				
				try {
					PreparedStatement stmts = conexao.prepareStatement(sqlUpdate);
					stmts.setString(1, novoNome);
					stmts.setInt(2, id);
					stmts.executeUpdate();
					int linhasAfetadas = stmts.executeUpdate();
					if(linhasAfetadas >0) {
						System.out.println("🪶 Nome atualizado com Sucesso para: " + novoNome);
					}else {
						 System.out.println("⚠️ Nenhum registro encontrado com esse ID.");

					}
					
				} catch (SQLException e) {
					System.out.println("❌ ocorreu um erro ao atualizar a linha");
					e.printStackTrace();
				}
				
				System.out.print("Nome atualizado com sucesso para: " + novoNome);
			
		conexao.close();
	}
}
