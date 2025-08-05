package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultaPessoa2 {

	public static void consultaLike(Connection conexao) throws SQLException {
		// nesse trecho de codigo o vai receber um valor digitado pelo usuário
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o nome que seja procurar: ");
		String pesquisa = entrada.nextLine();
		// abre a aconexão com o banco de dados

		// nessa trecho é feito a consulta utilizando o prepareStatement para o codigo
		// não ficar vuneravel a sqlinjection
		String sql = "SELECT * FROM pessoas where nome LIKE ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + pesquisa + "%");

		ResultSet resultado = stmt.executeQuery();
		entrada.close();

		List<Pessoa> pessoas = new ArrayList<>();

		while (resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}

		for (Pessoa p : pessoas) {
			System.out.println(p.getCodigo() + " --> " + p.getNome());
		}
		conexao.close();
	}
}
